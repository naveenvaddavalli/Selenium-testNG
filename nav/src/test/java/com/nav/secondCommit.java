package com.nav;

public class secondCommit {
	
	public class SecondCommit {

	    public void main(String[] args) {
	        SecondCommit sc = new SecondCommit();
	        sc.printWelcomeMessage();
	        System.out.println("Sum: " + sc.addNumbers(10, 25));
	        sc.reverseString("GitPush");
	        sc.checkEvenOrOdd(7);
	    }

	    public void printWelcomeMessage() {
	        System.out.println("Welcome to your second Git commit!");
	    }

	    public int addNumbers(int a, int b) {
	        return a + b;
	    }

	    public void reverseString(String input) {
	        StringBuilder reversed = new StringBuilder(input).reverse();
	        System.out.println("Reversed: " + reversed);
	    }

	    public void checkEvenOrOdd(int number) {
	        if (number % 2 == 0) {
	            System.out.println(number + " is Even");
	        } else {
	            System.out.println(number + " is Odd");
	        }
	    }
	}

}
