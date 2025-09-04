package com.nav;

public class thirdCommit {

	

	    public void generateRandomNumber() {
	        int random = (int) (Math.random() * 100);
	        System.out.println("Random number: " + random);
	    }

	    public void convertToUpper(String input) {
	        System.out.println("Uppercase: " + input.toUpperCase());
	    }

	    public void isPalindrome(String word) {
	        String reversed = new StringBuilder(word).reverse().toString();
	        if (word.equalsIgnoreCase(reversed)) {
	            System.out.println(word + " is a palindrome.");
	        } else {
	            System.out.println(word + " is not a palindrome.");
	        }
	    }

	    public void calculateFactorial(int num) {
	        int result = 1;
	        for (int i = 2; i <= num; i++) {
	            result *= i;
	        }
	        System.out.println("Factorial of " + num + " is: " + result);
	    }
	}
	
	

