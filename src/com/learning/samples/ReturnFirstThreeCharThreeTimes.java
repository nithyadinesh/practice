package com.learning.samples;

public class ReturnFirstThreeCharThreeTimes {

	public static void main(String[] args) {
	System.out.println(front3("java"));	

	}
	public static String front3(String str) {
		String result= str;
		  if(str.length()>3){
		    for(int i=1;i<=3;i++){
		       result=(str.substring(0,3));
		       result = result+front3(str);	    }
		  }
		  else{
		    for(int j=0;j<=3;j++){
		    	 result = str;
		    	 result  = str+ front3(str);
		      
		    }
		  }
		  return result;
		}

}
