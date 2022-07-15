package com.company;

public class LimitException extends Exception{
    public LimitException(String message, double amount) {
        super(message);
    }

    public static double getRemainingAmount(){
        return 0;
    }

}
