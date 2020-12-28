package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for(int i = start; i < stop; i++ ){
            if(i % 2 == 0) {
                evenNumbers += i;
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for(int i = start; i < stop; i++) {
            if(i % 2 == 1){
                oddNumbers += i;
            }
        }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for(int i = start; i < stop; i += step){
            squareNumbers += i*i;
        }
        return squareNumbers;
    }

    public static String getRange(int stop) {
        String returnedRange = "";
        for(int i = 0; i < stop ; i++){
            returnedRange += i;
        }
        return returnedRange;
    }

    public static String getRange(int start, int stop) {
        String returnedRange = "";
        for(int i = start; i < stop; i++){
            returnedRange += i;
        }
        return returnedRange;
    }


    public static String getRange(int start, int stop, int step) {
        String returnRange = "";
        for(int i = start; i < stop; i += step) {
            returnRange += i;
        }
        return returnRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponents = "";
        for(int i = start; i < stop; i += step) {
            int result = (int)Math.pow(i,exponent);
            exponents += result;
        }
        return exponents;
    }
}
