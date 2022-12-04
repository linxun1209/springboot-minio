package boot.spring.service.impl;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import boot.spring.service.MinIOService;
import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.UploadObjectArgs;
import io.minio.errors.MinioException;

@Service("minIOService")
public class MinIOServiceImpl implements MinIOService {

	private static final Logger LOG = LoggerFactory.getLogger(MinIOServiceImpl.class);

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeyException {
		try {
			// Create a minioClient with the MinIO server playground, its access
			// key and secret key.
			MinioClient minioClient = MinioClient.builder().endpoint("http://192.168.7.250:9000")
					.credentials("minioadmin", "minioadmin").build();

			// Make 'asiatrip' bucket if not exist.
			boolean found = minioClient.bucketExists(BucketExistsArgs.builder().bucket("abc").build());
			if (!found) {
				// Make a new bucket called 'asiatrip'.
				minioClient.makeBucket(MakeBucketArgs.builder().bucket("abc").build());
			} else {
				System.out.println("Bucket 'abc' already exists.");
			}

			// Upload '/home/user/Photos/asiaphotos.zip' as object name
			// 'asiaphotos-2015.zip' to bucket
			// 'asiatrip'.
//			minioClient.uploadObject(UploadObjectArgs.builder().bucket("abc").object("1.txt")
//					.filename("D:\\实时监控数据.txt").build());
//			System.out.println("'实时监控数据.txt' is successfully uploaded as "
//					+ "object '1.txt' to bucket 'abc'.");
			
			
		} catch (MinioException e) {
			System.out.println("Error occurred: " + e);
			System.out.println("HTTP trace: " + e.httpTrace());
		}
	}
}
