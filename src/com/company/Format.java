package com.company;

import java.util.Locale;

public class Format {
    private static final String DEFAULT_FORMAT = "%.2f";

    public static String floatFormat(double number) {
        return format(number, DEFAULT_FORMAT);
    }

    public static String floatFormat(double number, String format) {
        return format(number, format);
    }

    private static String format(double number, String format) {
        return String.format(Locale.US, format, number);
    }
}
