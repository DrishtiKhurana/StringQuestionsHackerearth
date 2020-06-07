package com.stringproblem;

public class Totalwaystodecode {

	public static void main(String[] args) {
		String sp="123";
		int k=sp.length();
		findnofways(sp,k);
	}

	 static int findnofways(String sp, int k) {
		if(k==0) {
			return 1;
		}
		int s=sp.length()-k;
		if(sp.charAt(s)==0) {
			return 0;
		}
		int result=0;
		result=findnofways(sp, k-1);
		if((Integer.parseInt(sp.substring(s, s+2))<=26 && k>=2)) {
			result+=findnofways(sp, k-2);
		}
		return result;
	}
}
