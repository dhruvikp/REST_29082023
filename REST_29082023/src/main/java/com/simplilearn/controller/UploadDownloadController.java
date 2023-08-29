package com.simplilearn.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadDownloadController {

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		File uploadedFile = new File("D:\\Dhruvik\\" + file.getOriginalFilename());
		uploadedFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(uploadedFile);
		fout.write(file.getBytes());
		fout.close();
		return "file uploaded successfully!";
	}

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity<Object> downloadFile(@RequestParam() String fileName) throws FileNotFoundException {
		File file = new File("D:\\Dhruvik\\" + fileName);
		InputStreamReader resource = new InputStreamReader(new FileInputStream(file));
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-disposition", "attachment; filename=" + fileName);
		ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).body(resource);
		return responseEntity;
	}

}