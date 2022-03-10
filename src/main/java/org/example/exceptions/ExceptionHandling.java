package org.example.exceptions;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {

        }
        catch (NullPointerException e) {

        }
        catch (Exception e) {

        }

        Scanner scanner = new Scanner(System.in);
        try {
            scanner.next();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }

        try {

        }
        finally {

        }

        try {

        }
        catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }

        try (Scanner scanner2 = new Scanner(System.in);
             Scanner scanner3 = new Scanner(System.in)) {

        }
        catch (Exception ex) {

        }
    }
}

