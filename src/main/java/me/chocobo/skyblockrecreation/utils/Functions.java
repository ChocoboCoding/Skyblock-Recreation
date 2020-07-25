package me.chocobo.skyblockrecreation.utils;

public class Functions {

    public static int toInt(double number) {
        number = Math.round(number);
        String s = "" + number;
        return Integer.getInteger(s);
    }

    public static int toInt(float number) {
        number = Math.round(number);
        String s = "" + number;
        return Integer.getInteger(s);
    }
}
