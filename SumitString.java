package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumitString {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

		while (testcases > 0) {
			String a = br.readLine();
			if(isitsumitstring(a)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			testcases--;
		}
	
}

	 static boolean isitsumitstring(String a) {
		 boolean flag=true;
		for(int i=1;i<a.length();i++) {
			int x=Math.abs(a.charAt(i)-a.charAt(i-1));
			if(x!=25 && x!=1) {
				flag=false;
				break;
			}
			
		}
		if(flag) {
			return true;
		}
		else {
			return false;
		}
	}

}