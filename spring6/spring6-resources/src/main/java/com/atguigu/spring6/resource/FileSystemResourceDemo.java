package com.atguigu.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

// 访问系统资源
public class FileSystemResourceDemo {
    public static void main(String[] args) {
        loadFileResource("D:\\Demo.txt");
        System.out.println("相对路径");
        loadFileResource("atguigu.txt");
    }

    public static void loadFileResource(String path) {
//        创建对象
        FileSystemResource resource = new FileSystemResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());

        try {
            InputStream in = resource.getInputStream();
            byte[] b = new byte[1024];
            while (in.read(b)!=-1){
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}