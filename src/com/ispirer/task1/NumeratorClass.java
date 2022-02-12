package com.ispirer.task1;

public class NumeratorClass {

    private static long count;

    public NumeratorClass() {
        count++;
    }

    public static long getCount() {
        return count;
    }
}
