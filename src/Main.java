package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    /**
     * Function that calculates the birth year
     * @param currentYear Year we are currently in
     * @param age Age of the user
     * @return Birth year of the user
     * Example: If the age is 22 and the current year is 2018, then giveBirthYear will calculate 2018 - 22 == 1996 and return it. Of course this is a bad implementation as currentYear and age can take negative values ...
     */
    public static int giveBirthYear(int currentYear, int age) {
        int birthYear = currentYear - age;
        return birthYear;
        // can also be written shorter such as:
        // return currentYear - age;
    }
    public static void main(String[] args) {
       System.out.println("What is your name?");
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
       System.out.println("Hello, " + name);
       System.out.println("And what is your age?");
       int age = scanner.nextInt();
       // We can also get the current year by doing:
       // int currentYear = Calendar.getInstance().get(Calendar.YEAR)
       // but this is bit complicated for now.
       // Source: https://stackoverflow.com/questions/136419/get-integer-value-of-the-current-year-in-java
       int birthYear = giveBirthYear(2018, age);
       System.out.println(name + " is " + age + " years old.");
       System.out.println("which means " + name + " is born in " + birthYear);

       System.out.println("so... what is your GPA? ");
       double gpa = scanner.nextDouble();
       // Four different messages based on the GPA given
       if(gpa >= 3.5) {
           System.out.println("Wow you are a smart student");
       } else if(gpa >= 2.0) {
           System.out.println("You are doing quite well");
       } else if(gpa >= 1.0){
           System.out.println("Try better :)");
       } else {
           System.out.println("Find another university bro");
       }
    }
}