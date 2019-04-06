package com.example.java;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.*;
import java.text.DateFormat;


public class Main extends Tab {

    public static void main(String[] args) {
        System.out.println("Hello there we need to conform your identity , tap 1 to continue : ");
        int cnt;
        Scanner nm = new Scanner(System.in);
        cnt = nm.nextInt();
        DateFormat  date = new DateFormat() {
            @Override
            public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
                return null;
            }

            @Override
            public Date parse(String source, ParsePosition pos) {
                return null;
            }
        }

        if (cnt == 1) {
            check_users();
        }
        if (cnt != 1) {
            System.out.println("Good bye");

        }
        if (A == 2) {

            System.out.println("Hello Admin, now you can modify anything");
            System.out.println("Users you have :");
            show_users();
        }
        if (A == 1) {
            System.out.println("Welcome in your own page");

        } else {
            System.out.println("You are not user , if you want to sign up tap 1  ");
            Scanner nb = new Scanner(System.in);
            int tt = nb.nextInt();
            if (tt == 1) {

                check_users();
            } else {
                System.out.println("Good bye");
            }

        }
    }

        }


