package com.test.io;

import com.test.io.code.CodeGenerate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTXT {


    public static void main(String[] args) throws Exception{
        //1. 文件夹的路径  文件名
        String directory = "doc";
        String filename = "50w1.txt";

        //2.  创建文件夹对象     创建文件对象
        File file = new File(directory);
        //如果文件夹不存在  就创建一个空的文件夹
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(directory, filename);
        //如果文件不存在  就创建一个空的文件
        if (!file2.exists()) {
            file2.createNewFile();
        }
        //3.写入数据
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream(directory + "/" + filename);
        //开始写
        for (int i = 0; i < 500000; i++) {
            String str = CodeGenerate.getCode();
            byte[] bytes = str.getBytes();
            //将byte数组中的所有数据全部写入
            fos.write(bytes);
        }

        //关闭流
        fos.close();
    }




}
