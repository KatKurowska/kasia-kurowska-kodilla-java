package com.kodilla.exception.test;


public class ExceptionHandling extends Exception{

    public void processSecondChallenge() {

        try {SecondChallenge secondChallenge = new SecondChallenge();
            secondChallenge.probablyIWillThrowException(3.5,2.0);}
        catch (Exception e){
            System.out.println("Current values of parameters x and y cause an exception " + e);
        }
        finally{
            System.out.println("Method processing attempt completed.");
        }
    }
}
