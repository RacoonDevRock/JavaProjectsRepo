package com.springboot.data.jpa.services.impl;

import com.springboot.data.jpa.services.IUploadFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadServiceImpl implements IUploadFileService {
    private final Logger logger = LoggerFactory.getLogger(UploadServiceImpl.class);
    private final static String UPLOADS_FOLDER = "uploads";

    @Override
    public Resource load(String filename) throws MalformedURLException {
        Path pathPhoto = getPath(filename);
        logger.info("pathPhoto: " + pathPhoto);

        Resource resource = null;
        resource = new UrlResource(pathPhoto.toUri());

        if (!resource.exists() && !resource.isReadable()) {
            throw new RuntimeException("Error: No se puede cargar la imagen " + pathPhoto.toString());
        }
        return resource;
    }

    @Override
    public String copy(MultipartFile file) throws IOException {
        Path rootPath = getPath(file.getOriginalFilename());

        logger.info("rootPath: " + rootPath);

        Files.copy(file.getInputStream(), rootPath);

        return file.getOriginalFilename();
    }

    @Override
    public boolean delete(String filename) {
        Path rootPath = getPath(filename);
        File archivo = rootPath.toFile();

        if (archivo.exists() && archivo.canRead()) {
            if (archivo.delete()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteAll() {
        FileSystemUtils.deleteRecursively(Paths.get(UPLOADS_FOLDER).toFile());
    }

    @Override
    public void init() throws IOException {
        Files.createDirectory(Paths.get(UPLOADS_FOLDER));
    }

    public Path getPath(String filename) {
        return Paths.get(UPLOADS_FOLDER).resolve(filename).toAbsolutePath();
    }
}
