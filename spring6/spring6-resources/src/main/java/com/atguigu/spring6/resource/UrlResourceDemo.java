package com.atguigu.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

//演示UrlResource访问网络资源
public class UrlResourceDemo {
    public static void main(String[] args) {
//        访问网络资源
//        loadUrlResource("https://www.baidu.com");

//        访问文件系统资源
        loadUrlResource("file:atguigu.txt");
    }


//    访问前缀http、file
    public static void loadUrlResource(String path){
        try {
//            创建Resource实现类的对象 UrLResource
            UrlResource urlResource = new UrlResource(path);

//            获取资源信息
            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURL());
            System.out.println(urlResource.getDescription());
            System.out.println(urlResource.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
