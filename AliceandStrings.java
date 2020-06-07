package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AliceandStrings {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String a = br.readLine();                
	        String b = br.readLine(); 

		    if(isequal(a,b)) {
		    	System.out.println("YES");
		    }
		    else {
		    	System.out.println("NO");
		    }
	}

	 static boolean isequal(String a, String b) {
		 {
		        if(a.length()!=b.length())
		            return false;
		        int diff[]=new int[a.length()];
		        for(int i=0;i<diff.length;i++)
		            diff[i]=(int)b.charAt(i)-(int)a.charAt(i);
		        for(int i=1;i<diff.length;i++)
		            if(diff[i]>diff[i-1])
		               return false;
		        return true;     
		    }
	}
}
