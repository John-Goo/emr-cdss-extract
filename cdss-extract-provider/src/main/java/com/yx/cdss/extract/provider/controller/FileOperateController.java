/******************************************************************************
 * Copyright (C) 2017  ShenZhen INNOPRO Co.,Ltd
 * All Rights Reserved.
 * 本软件为精华隆智慧感知科技（深圳）股份有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.bo.Res;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.test.Person;
import com.yx.cdss.extract.provider.test.Student;
import com.yx.cdss.extract.provider.util.WFile;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: CustomerController
 * @version 2.0
 * @Desc: 客户信息业务处理
 * @author Jack
 * @date 2019年1月25日上午11:02:10
 * @history v2.0
 *
 */

@RestController
public class FileOperateController {

	@Autowired
    private RedisTemplate redisTemplate;


	@GetMapping("/video/display")
	@ApiOperation("断点续传記錄")
	public void download(HttpServletRequest request, HttpServletResponse response) {
		String path = "F:\\training-video\\demo.mp4";
		File file = new File(path);
		System.out.println("=======断点续传处理中");
		downloadVideo(file, request, response);
	}


	public static void downloadVideo(File file, HttpServletRequest request, HttpServletResponse response) {
		int contentLength = Integer.parseInt(String.valueOf(file.length()));
		try {
			RandomAccessFile randomFile = new RandomAccessFile(file, "r");
			Throwable var6 = null;

			try {
				ServletOutputStream out = response.getOutputStream();
				Throwable var8 = null;

				try {
					String range = request.getHeader("Range");
					int start = 0;
					int end = 0;
					if (range != null && range.startsWith("bytes=")) {
						String[] values = range.split("=")[1].split("-");
						start = Integer.parseInt(values[0]);
						if (values.length > 1) {
							end = Integer.parseInt(values[1]);
						}
					}

					int requestSize;
					if (end != 0 && end > start) {
						requestSize = end - start + 1;
					} else {
						requestSize = 2147483647;
					}

					response.setContentType("video/mp4");
					response.setHeader("Accept-Ranges", "bytes");
					if (range == null) {
						response.setHeader("Content-length", String.valueOf(contentLength));
					} else {
						response.setStatus(206);
						long requestStart = 0L;
						long requestEnd = 0L;
						String[] ranges = range.split("=");
						if (ranges.length > 1) {
							String[] rangeDatas = ranges[1].split("-");
							requestStart = (long) Integer.parseInt(rangeDatas[0]);
							if (rangeDatas.length > 1) {
								requestEnd = (long) Integer.parseInt(rangeDatas[1]);
							}
						}

						long length = 0L;
						if (requestEnd > 0L) {
							length = requestEnd - requestStart + 1L;
							response.setHeader("Content-length", "" + length);
							response.setHeader("Content-Range", "bytes " + requestStart + "-" + requestEnd + "/" + contentLength);
						} else {
							length = (long) contentLength - requestStart;
							response.setHeader("Content-length", "" + length);
							response.setHeader("Content-Range", "bytes " + requestStart + "-" + (contentLength - 1) + "/" + contentLength);
						}
					}

					int needSize = requestSize;
					byte[] buffer = new byte[4096];
					randomFile.seek((long) start);

					while (needSize > 0) {
						int len = randomFile.read(buffer);
						out.write(buffer, 0, len);
						if (len < buffer.length) {
							break;
						}

						needSize -= buffer.length;
					}
				} catch (Throwable var43) {
					var8 = var43;
					throw var43;
				} finally {
					if (out != null) {
						if (var8 != null) {
							try {
								out.close();
							} catch (Throwable var42) {
								var8.addSuppressed(var42);
							}
						} else {
							out.close();
						}
					}

				}
			} catch (Throwable var45) {
				var6 = var45;
				throw var45;
			} finally {
				if (randomFile != null) {
					if (var6 != null) {
						try {
							randomFile.close();
						} catch (Throwable var41) {
							var6.addSuppressed(var41);
						}
					} else {
						randomFile.close();
					}
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

}

	@RequestMapping(value = "/getVedio")
	public void getVedio(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = "F:\\training-video\\demo.mp4";
		BufferedInputStream bis = null;
		try {
			File file = new File(path);
			if (file.exists()) {
				long p = 0L;
				long toLength = 0L;
				long contentLength = 3L;
				int rangeSwitch = 0; // 0,从头开始的全文下载；1,从某字节开始的下载（bytes=27000-）；2,从某字节开始到某字节结束的下载（bytes=27000-39000）
				long fileLength;
				String rangBytes = "";
				fileLength = file.length();

				// get file content
				InputStream ins = new FileInputStream(file);
				bis = new BufferedInputStream(ins);

				// tell the client to allow accept-ranges
				response.reset();
				response.setHeader("Accept-Ranges", "bytes");

				// client requests a file block download start byte
				String range = request.getHeader("Range");
				if (range != null && range.trim().length() > 0 && !"null".equals(range)) {
					response.setStatus(javax.servlet.http.HttpServletResponse.SC_PARTIAL_CONTENT);
					rangBytes = range.replaceAll("bytes=", "");
					if (rangBytes.endsWith("-")) {  // bytes=270000-
						rangeSwitch = 1;
						p = Long.parseLong(rangBytes.substring(0, rangBytes.indexOf("-")));
						contentLength = fileLength - p;  // 客户端请求的是270000之后的字节（包括bytes下标索引为270000的字节）
					} else { // bytes=270000-320000
						rangeSwitch = 2;
						String temp1 = rangBytes.substring(0, rangBytes.indexOf("-"));
						String temp2 = rangBytes.substring(rangBytes.indexOf("-") + 1, rangBytes.length());
						p = Long.parseLong(temp1);
						toLength = Long.parseLong(temp2);
						contentLength = toLength - p + 1; // 客户端请求的是 270000-320000 之间的字节
					}
				} else {
					contentLength = fileLength;
				}

				// 如果设设置了Content-Length，则客户端会自动进行多线程下载。如果不希望支持多线程，则不要设置这个参数。
				// Content-Length: [文件的总大小] - [客户端请求的下载的文件块的开始字节]
				response.setHeader("Content-Length", new Long(contentLength).toString());

				// 断点开始
				// 响应的格式是:
				// Content-Range: bytes [文件块的开始字节]-[文件的总大小 - 1]/[文件的总大小]
				if (rangeSwitch == 1) {
					String contentRange = new StringBuffer("bytes ").append(new Long(p).toString()).append("-")
							.append(new Long(fileLength - 1).toString()).append("/")
							.append(new Long(fileLength).toString()).toString();
					response.setHeader("Content-Range", contentRange);
					bis.skip(p);
				} else if (rangeSwitch == 2) {
					String contentRange = range.replace("=", " ") + "/" + new Long(fileLength).toString();
					response.setHeader("Content-Range", contentRange);
					bis.skip(p);
				} else {
					String contentRange = new StringBuffer("bytes ").append("0-")
							.append(fileLength - 1).append("/")
							.append(fileLength).toString();
					response.setHeader("Content-Range", contentRange);
				}

				String fileName = file.getName();
				response.setContentType("application/octet-stream");
				response.addHeader("Content-Disposition", "attachment;filename=" + fileName);

				OutputStream out = response.getOutputStream();
				int n = 0;
				long readLength = 0;
				int bsize = 1024;
				byte[] bytes = new byte[bsize];
				if (rangeSwitch == 2) {
					// 针对 bytes=27000-39000 的请求，从27000开始写数据
					while (readLength <= contentLength - bsize) {
						n = bis.read(bytes);
						readLength += n;
						out.write(bytes, 0, n);
					}
					if (readLength <= contentLength) {
						n = bis.read(bytes, 0, (int) (contentLength - readLength));
						out.write(bytes, 0, n);
					}
				} else {
					while ((n = bis.read(bytes)) != -1) {
						out.write(bytes, 0, n);
					}
				}
				out.flush();
				out.close();
				bis.close();
			} else {
//                if (logger.isDebugEnabled()) {
//                    logger.debug("Error: file " + path + " not found.");
//                }
			}
		} catch (IOException ie) {
			ie.printStackTrace();
			// 忽略 ClientAbortException 之类的异常
		} catch (Exception e) {
			e.printStackTrace();
//            logger.error(e.getMessage());
		}


	}
	@PostMapping("/recv")
	public WResult<Person> recv(@RequestBody Student student){
		Map<String,Student> stuMap = new HashMap<>();
		stuMap.put("name1",new Student("90018001","John1"));
		stuMap.put("name2",new Student("90018002","John2"));
		System.out.println(">>>　接收到参数："+student);
		System.out.println("-------  入库操作 ---------");
		Person person = new Person("411528198709015894","谷海江",21,"深圳");
		WResult result = WResult.newInstance();
		HashOperations hps = redisTemplate.opsForHash();
		hps.putAll("stu",stuMap);
		System.out.println("h1:"+hps.get("stu","name1"));
		hps.put("stu","name3",new Student("90018003","John3"));
		System.out.println("h3:"+hps.get("stu","name3"));
		Student stu = (Student) hps.get("stu","name4");
		System.out.println(stu);
		result.ok(person);
		return result;
	}




	@PostMapping("/upload")
	public Res upload(@RequestParam(name = "file", required = false) MultipartFile  file)  {
		String prefixPath = "f1/f2/";
		Res res = new Res();
		res.setCode(500);
		if (file == null ) {
			res.setMessage("上传文件不能为空");
			return res;
		}
		String fileUrl = null;
		try {
			InputStream in = file.getInputStream();
			fileUrl = WFile.builder()
					.orgType("company")
					.orgCode("10086")
					.userId("1000")
					.moduleDir("activity/part")
					.originFileName(file.getOriginalFilename())
					.post(in)
					.result();

		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("bucketName", "company");
		data.put("fileName", fileUrl);
		res.setCode(200);
		res.setMessage("上传成功");
		res.setData(data);
		return res;
	}



	@PostMapping("/upload1")
	public Res upload1(@RequestParam(name = "file", required = false) MultipartFile[] file) throws IOException {
		String prefixPath = "f1/f2/";
		Res res = new Res();
		res.setCode(500);
		if (file == null || file.length == 0) {
			res.setMessage("上传文件不能为空");
			return res;
		}
		List<InputStream> streamList = new ArrayList<InputStream>(file.length);
		for (MultipartFile multipartFile : file) {
			BufferedImage sourceImage = ImageIO.read(multipartFile.getInputStream());
			sourceImage.getWidth();
			sourceImage.getHeight();
			String orgfileName = multipartFile.getOriginalFilename();
			orgfileName = prefixPath + orgfileName;
			InputStream in = null;
			try {
				in = multipartFile.getInputStream();
				streamList.add(in);
			} catch (Exception e) {
				res.setMessage("上传失败");
				return res;
			}finally {
				if(in !=null){
					//in.close();
				}
			}
		}
		doPost("http://localhost:8080/upload1/file",streamList);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("bucketName", "BUCKETNAME");
		//data.put("fileName", orgfileNameList);
		res.setCode(200);
		res.setMessage("上传成功");
		res.setData(data);
		return res;
	}


	public static String doPost(String url,List<InputStream> isList) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost post = new HttpPost(url);
			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			for (InputStream in : isList) {
				builder.addBinaryBody("file", in);
			}
			HttpEntity multipart = builder.build();
			post.setEntity(multipart);
			CloseableHttpResponse response = httpClient.execute(post);
			HttpEntity responseEntity = response.getEntity();
			String sResponse = EntityUtils.toString(responseEntity, "UTF-8");
			System.out.println("Post 返回结果" + sResponse);
		}catch (Exception e){
			e.printStackTrace();

		}finally {
			for (InputStream in : isList) {
				if(in !=null){
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return null;
	}

	/**
	 * post请求（用于请求file传输）
	 * @param url
	 * @param in
	 * @return
	 */
	public static String doPost(String url, InputStream in) throws Exception {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);// 创建httpPost
		//httpPost.setHeader("Accept", "application/octet-stream");
		//httpPost.setHeader("Content-Type", "application/octet-stream");
		//String charSet = "UTF-8";
		CloseableHttpResponse response = null;
		httpPost.setEntity(new InputStreamEntity(in));
		try {
			response = httpclient.execute(httpPost);
			StatusLine status = response.getStatusLine();
			int state = status.getStatusCode();
			if (state == 200) {
				HttpEntity responseEntity = response.getEntity();
				String jsonString = EntityUtils.toString(responseEntity);
				return jsonString;
			}
			else{
				//logger.error("请求返回:"+state+"("+url+")");
			}
		}
		finally {
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public void show(String url,InputStream in) throws IOException {
		String sURL="http://172.16.101.46:14401/editorialincre";

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost uploadFile = new HttpPost(sURL);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.addBinaryBody("file",in);
		builder.addBinaryBody("file",in);

		HttpEntity multipart = builder.build();
		uploadFile.setEntity(multipart);
		CloseableHttpResponse response = httpClient.execute(uploadFile);
		HttpEntity responseEntity = response.getEntity();
		//String sResponse=EntityUtils.toString(responseEntity, "UTF-8");
		//System.out.println("Post 返回结果"+sResponse);
	}
	

}
