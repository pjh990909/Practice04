package com.javaex.practiec;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i]=num;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}System.out.print(lotto[i] + " ");
		}
		
	}

}
