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

        System.out.println("The lowest vehicle price is " + "$" + lowestPrice);

//      QUESTION 3: FIND THE AREA OF A CIRCLE

        double radius = 7.25;

        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle is %.2f ", circleArea);

//      QUESTION 4: FIND THE SQUARE ROOT

        double number = 5.0;

        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is %.2f " + squareRoot);

    }
}
