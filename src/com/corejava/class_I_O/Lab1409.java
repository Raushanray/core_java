package com.corejava.class_I_O;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Lab1409 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("D:\\D1\\abc.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);) {
			while (true) {
				String id = br.readLine();
				if (id == null)
					break;
				System.out.println(id);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
