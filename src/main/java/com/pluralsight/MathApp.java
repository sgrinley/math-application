package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

//      EXERCISE 3
//      QUESTION 1: FIND THE HIGHEST SALARY

        double bobSalary = 75000;
        double garySalary = 82000;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + "$" + highestSalary);

//      QUESTION 2: FIND THE LOWEST VEHICLE PRICE
        double carPrice = 25000;
        double truckPrice = 40000;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest vehicle price is " + lowestPrice);

    }
}
