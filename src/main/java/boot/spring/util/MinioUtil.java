package boot.spring.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import boot.spring.domain.Fileinfo;
import io.minio.BucketExistsArgs;
import io.minio.GetObjectArgs;
import io.minio.ListObjectsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.RemoveBucketArgs;
import io.minio.RemoveObjectArgs;
import io.minio.Result;
import io.minio.messages.Bucket;
import io.minio.messages.Item;

@Component
public class MinioUtil {
	@Autowired
    private MinioClient minioClient;
	
	/**
	 * 创建一个桶
	 */
	public void createBucket(String bucket) throws Exception {
		boolean found = minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucket).build());
		if (!found) {
			minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucket).build());
		}
	}
	
	/**
	 * 上传一个文件
	 */
	public void uploadFile(InputStream stream, String bucket, String objectName) throws Exception {
		minioClient.putObject(PutObjectArgs.builder().bucket(bucket).object(objectName)
				.stream(stream, -1, 10485760).build());
	}
	
	/**
	 * 列出所有的桶
	 */
	public List<String> listBuckets() throws Exception {
		List<Bucket> list = minioClient.listBuckets();
		List<String> names = new ArrayList<>();
		list.forEach(b -> {
			names.add(b.name());
		});
		return names;
	}
	
	/**
	 * 列出一个桶中的所有文件和目录
	 */
	public List<Fileinfo> listFiles(String bucket) throws Exception {
		Iterable<Result<Item>> results = minioClient.listObjects(
			    ListObjectsArgs.builder().bucket(bucket).recursive(true).build());
			
			List<Fileinfo> infos = new ArrayList<>();
				results.forEach(r->{
					Fileinfo info = new Fileinfo();
					try {
						Item item = r.get();
						info.setFilename(item.objectName());
						info.setDirectory(item.isDir());
						infos.add(info);
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
		return infos;
	}
	
	/**
	 * 下载一个文件
	 */
	public InputStream download(String bucket, String objectName) throws Exception {
		InputStream stream = minioClient.getObject(
		              GetObjectArgs.builder().bucket(bucket).object(objectName).build());
		return stream;
	}
	
	/**
	 * 删除一个桶
	 */
	public void deleteBucket(String bucket) throws Exception {
		minioClient.removeBucket(RemoveBucketArgs.builder().bucket(bucket).build());
	}
	
	/**
	 * 删除一个对象
	 */
	public void deleteObject(String bucket, String objectName) throws Exception {
		minioClient.removeObject(RemoveObjectArgs.builder().bucket(bucket).object(objectName).build());
	}
}
