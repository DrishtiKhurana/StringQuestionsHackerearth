package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrome {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

		while (testcases > 0) {
			String a = br.readLine();
			if(isitpallindrome(a)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			testcases--;
		}
}

	private static boolean isitpallindrome(String a) {
		 int start=0;
		 int end=a.length()-1;
		 boolean flag=false;
		while(start<=end) {
			if(a.charAt(start)==a.charAt(end)) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
			start++;
			end--;
		}
		if(flag) {
		return true;
		}
		else {
			return false;
		}
	}

		
	}


