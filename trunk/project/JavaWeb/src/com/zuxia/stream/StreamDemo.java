/**
 *******************************************************************************
 * StreamDemo.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  演示文件的读取和写入
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * StreamDemo概要说明
 * 
 *
 * @author 杨砚
 */
public class StreamDemo {
	public static void main(String[] args) {
		testFileInputStream();
	}

	private static void testBufferedReader() {
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader("c:/Sound.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			String result = bufferedReader.readLine();
			while(result != null){
				System.out.println(result);
				result = bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void testFileInputStream(){
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("c:/Sound.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] result = new byte[5000];
		try {
			fileInputStream.read(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("d:/Sound.txt");
			fileOutputStream.write(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
