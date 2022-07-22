package xyz;

import java.util.Scanner;

public class PassWord {

	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    System.out.print("Please enter a given  password : ");
	    String pass = in.nextLine();
	    
	    if(pass.length()>15 || pass.length()<8) {
	    	System.out.println("password invalid");
	    }
	    else {
	    	for(int i=0;i<pass.length();i++) {
	    		if(!Character.isDigit(pass.charAt(i))){
	    			if(!Character.isLowerCase(pass.charAt(i))) {
	    				if(!Character.isUpperCase(pass.charAt(i))){
	    					System.out.println(pass);
	    				}
	    			}
	    		}	    			
	    	}
	    }
	}
}

