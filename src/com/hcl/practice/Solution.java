package com.hcl.practice;

public class Solution {

	static long getSequenceSum(int i, int j, int k) {
        int result = 0;
        for(int inc = i; inc<j; inc++){
            result += inc;
        }
        for(int dec = j; dec>=k; dec--){
            result += dec;
        }
        Long ret = (long) result;
        return ret;
        
    }
	
	public static void main (String[] args) {
		System.out.println(getSequenceSum(-1, 50, 40));
	}
	
}
