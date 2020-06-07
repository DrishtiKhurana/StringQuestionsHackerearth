package com.stringproblem;

import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();
            
            String out_ = decode(s);
            System.out.println(out_);
         }
 
         wr.close();
         br.close();
    }
    static String decode(String s)
    {
        int n=s.length();
        char[] arr=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        //String ans="";
        if(n%2==0)
        {
            ans.append(arr[0]);
            for(int i=1;i<n;i++)
            {
                if(i%2==1)
                    ans.append(arr[i]);
                else
                    ans.insert(0,arr[i]);
            }
        }
        else
        {
            ans.append(arr[0]);
            for(int i=1;i<n;i++)
            {
                if(i%2==1)
                    ans.insert(0,arr[i]);
                else
                    ans.append(arr[i]);
            }
        }
        return ans.toString();
    
    }
}
