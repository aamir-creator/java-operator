package com.company;
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
public class Main {

    public static void main(String[] args) {
        //addition
        int result = 1 + 8; // 1+8 =9
        System.out.println("1 + 8 = " + result);
        int myOldResult = result;
        System.out.println("my ols result is " + myOldResult);
        //sub
        result = result - 1; // 9 - 1 = 8
        System.out.println("9 - 1 = " + result);

        //multiply
        result = result * 2;
        System.out.println("8 * 2 = " + result);

        //divide
        result = result / 4;
        System.out.println("16 / 4 = " + result);

        //reminder
        result = result % 3;
        System.out.println("4 % 4 = " + result);

        //abbreviating
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        //greater then
        if (result > 2)
            System.out.println("Result is greater then 2");

        //greater then and equal to
        if (result >= 2)
            System.out.println("Result is greater then or equal to 2");

        //less then
        if (result < 20)
            System.out.println("Result is less then 20");

        //less then and equal to
        if (result <= 20)
            System.out.println("Result is less then or equal to 20");


        //And Operator
        if ((result > 1) && (result < 2))
            System.out.println("Result is greater then 1 and less then 2");

        //OR Operator
        if ((result > 1) || (result < 2))
            System.out.println("Result is greater then 1 OR less then 2");



        boolean isCar = false;
        if (isCar){
            System.out.println("Is Car is true");
        }

        boolean wasCar = isCar ? true:false;
        if (wasCar){
            System.out.println("Was car is true");
        }

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double myValueTotal = (firstValue + secondValue) * 100.00d;
        double myReminder = myValueTotal % 40.00d;
        boolean isNoReminder = (myReminder == 0) ? true:false;
        if (!isNoReminder){
            System.out.println("Got Some Reminder");
        }
    }
}
