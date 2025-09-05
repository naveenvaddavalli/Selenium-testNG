package com.nav;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fourthCommit {

    public static void main(String[] args) {
        fourthCommit fc = new fourthCommit();

        fc.printCurrentTimestamp();
        fc.countVowels("automationFramework");
        fc.findMax(42, 17, 89);
        fc.generateGreeting("Naveen");
    }

    public void printCurrentTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Current Timestamp: " + formatted);
    }

    public void countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Vowel count in \"" + input + "\": " + count);
    }

    public void findMax(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Max of (" + a + ", " + b + ", " + c + ") is: " + max);
    }

    public void generateGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to your fourth Git commit.");
    }
}