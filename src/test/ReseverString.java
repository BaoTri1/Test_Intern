package test;

import java.util.Scanner;

public class ReseverString {
	
	public static final String MESSAGE = "Số n không hợp lệ. Số n phải lớn hơn 0 và nhỏ hơn hoặc bằng chiều dài chuỗi";
	
	public static void reseverString(String s, int n) {
		if(n < 0 || n > s.length()) {
			System.out.println(MESSAGE);
			return;
		}
		String stringFirstToN = s.substring(0, n);
		String stringCL = s.substring(n);
		String stringResever = "";
		char[] tmp = stringFirstToN.toCharArray();
		for(int i = tmp.length -1; i >= 0; i--) {
			stringResever += tmp[i];
		}
		
		String output = stringResever + stringCL;
		System.out.println(output);
		
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		String s;
		int n;
		System.out.println("Nhập vào chuỗi s: ");
		s = scan.nextLine();
		System.out.println("Nhập vào số nguyên n: ");
		n = scan.nextInt();
		
		reseverString(s, n);
		
	}

}
