package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String exp = "";
        for(int i = 0; i < numberOfRows-1; i++) {
            for(int j = 0; j <= i; j++){
                exp += "*";
            }
            exp += "\n";
        }

        return exp;
    }

    public static String getRow(int numberOfStars) {
        String exp = "";
        for(int i = 0; i < numberOfStars; i++){
            exp += "*";
        }
        return exp;
    }

    public static String getSmallTriangle() {
        String exp ="";
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j <= i; j++) {
                exp += "*";
            }
            exp += "\n";
        }
        return exp;
    }

    public static String getLargeTriangle() {
        String exp ="";
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j <= i; j++) {
                exp += "*";
            }
            exp += "\n";
        }
        return exp;
    }
}
