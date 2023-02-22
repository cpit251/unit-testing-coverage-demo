package org.example;

public class Calculator {

    public int add(int x, int y){
        return x+y;
    }

    public String getGradeLetter(int grade) {
        if(grade < 0 || grade >100){
            throw new IllegalArgumentException("Grades can not be below 0 and above 100.");
        }
        else if (grade < 60){
            return "F";
        }
        else if (grade <65) {
            return "D";
        }
        else if (grade <70) {
            return "D+";
        }
        else if (grade <75) {
            return "C";
        }
        else if (grade <80) {
            return "C+";
        }
        else if (grade <85) {
            return "B";
        }
        else if (grade <90) {
            return "B+";
        }
        else if (grade <95) {
            return "A";
        }
        return "A+";
    }
}
