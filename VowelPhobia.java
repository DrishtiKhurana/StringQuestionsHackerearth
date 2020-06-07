package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelPhobia {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

		while (testcases > 0) {
			String a = br.readLine();
			System.out.println(countvowels(a));
			testcases--;
		}
	}



	 static int countvowels(String a) {
		int count=0;
		 for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	 }
}