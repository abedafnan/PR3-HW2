package com.abedafnan;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Question 1 - a
        try {
            throw new ExceptionB("This is ExceptionB");
        } catch (ExceptionA exceptionA) {
            System.out.println("ExceptionB is caught");
        }

        try {
            throw new ExceptionC("This is ExceptionC");
        } catch (ExceptionA exceptionA) {
            System.out.println("ExceptionC is caught");
        }

        System.out.println();

        // Question 1 - b
        try {
            throw new ExceptionA("This is ExceptionA");
        } catch (Exception e) {
            System.out.println("ExceptionA is caught");
        }

        try {
            throw new ExceptionB("This is ExceptionB");
        } catch (Exception e) {
            System.out.println("ExceptionB is caught");
        }

        try {
            throw new NullPointerException("This is a NullPointerException");
        } catch (Exception e) {
            System.out.println("NullPointerException is caught");
        }

        try {
            throw new IOException("This is an IOException");
        } catch (Exception e) {
            System.out.println("IOException is caught");
        }

        System.out.println();

        // Question 2
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("The exception stack trace:");
            e.printStackTrace();
        }

    }

    public static void someMethod() throws ExceptionA {
        try {
            someMethod2(0);
        } catch (ExceptionA e) {
            System.out.println("Rethrowing the exception");
            throw new ExceptionA("This is ExceptionA again");
        }
    }

    public static void someMethod2(int n) throws ExceptionA {
        if (n <= 0) {
            throw new ExceptionA("This is ExceptionA");
        }
    }
}
