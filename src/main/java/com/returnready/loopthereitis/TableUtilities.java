package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        String exp = "";

        for (int i = 1; i <6; i++) {
            for (int j = 1; j < 6; j++){
                exp += String.format("%3d |", j*i);
            }
            exp += "\n";
        }

        return exp;
    }

    public static String getLargeMultiplicationTable() {

        String exp = "";

        for (int i = 1; i <11; i++) {
            for (int j = 1; j < 11; j++){
                exp += String.format("%3d |", j*i);
            }
            exp += "\n";
        }

        return exp;
    }

    public static String getMultiplicationTable(int tableSize) {

        String exp = "";

        for (int i = 1; i <21; i++) {
            for (int j = 1; j < 21; j++){
                exp += String.format("%3d |", j*i);
            }
            exp += "\n";
        }

        return exp;
    }
}
