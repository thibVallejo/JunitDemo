package com.m2i.poec.junit;

public class Fibo {

	public static int fib(int n) {
	    if(n<0 ){
	    	throw new IllegalArgumentException("Bordel on a demander un nombre positif, tu trouve que ça : " + n +" c'est négatif ?");
	    }else if(n>46){
	    	throw new IllegalArgumentException("Ah ta voulu jouer a qui a la plus grosse, ben voila ta planter la fonction, ptit bite va");
	    
	    }else if(n==0){
			return 0;
		}else if(n<3){
			return 1;
		}else{
			return fib(n-1)+fib(n-2);
		}
		
	}
	
	
}
