package com.javaex.practiec;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double one=sc.nextDouble();
		double two=sc.nextDouble();
		double three=sc.nextDouble();
		double four=sc.nextDouble();
		double five=sc.nextDouble();
		
		double[] num = new double[5];
		num[0] = one;
		num[1] = two;
		num[2] = three;
		num[3] = four;
		num[4] = five;
		
		double result = 0;
		
		for(int i=0;i<num.length;i++) {
			result = result+num[i];
		}System.out.println("평균은 " + result/5 +" 입니다.");
		
		sc.close();

	}

}
