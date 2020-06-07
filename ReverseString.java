package com.stringproblem.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

		while (testcases > 0) {
			String a = br.readLine();
			reverse(a);
			testcases--;
		}
	}

	private static void reverse(String a) {
		
		for(int i=a.length()-1;i>=0;i--) {
		 System.out.print(a.charAt(i));	
		}
		System.out.println();
		
	}
}
