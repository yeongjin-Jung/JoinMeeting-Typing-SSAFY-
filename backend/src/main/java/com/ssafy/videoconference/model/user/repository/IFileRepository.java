package com.ssafy.videoconference.model.user.repository;

import org.springframework.web.multipart.MultipartFile;

public interface IFileRepository {
	public void saveFile(MultipartFile multipartFile, String rootPath, String saveFileName);
	public void readFile();
}
