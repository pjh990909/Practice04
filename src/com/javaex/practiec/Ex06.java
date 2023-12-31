package com.javaex.practiec;

public class Ex06 {

	public static void main(String[] args) {
		
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		char[] qwe;
		qwe = new char[16];
		
		
		
		for(int i=0;i<c.length;i++) {
			qwe[i]=c[i];
			qwe[4]=',';
			qwe[7]=',';
			qwe[9]=',';
		}
		System.out.println(c);
		System.out.println(qwe);
		
		
	    
		
		
		
		
		

	}

}
