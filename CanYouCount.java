package com.stringproblem.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanYouCount {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

		while (testcases > 0) {
			String a = br.readLine();
			System.out.println(count(a));
			testcases--;
		}
}

	 static long count(String a) {
		 long count=0;
		 long replac=1;
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)=='a' ||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				count++;
				a=a.replace(a.charAt(i),'d');
			}
			if(a.charAt(i)=='_') {
				replac=replac*count;
			}
		}
		return replac;
		
	}
}