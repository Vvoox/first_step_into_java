package com.example.java;
import java.lang.*;
import java.util.Scanner;

public class Tab {
    private static String   name, password , repassword;
    public static int A=0;

    public static void check_users() {

        System.out.println("Hello There , we need to check the user identity , if you are already register with tap 1 else 2");
        Scanner nm = new Scanner(System.in);
        System.out.print("1 or 2 : ");
        int tap;

        tap=nm.nextInt();


        if(tap==1){

            System.out.print("Your name : ");
            Scanner nme = new Scanner(System.in);
            name =nme.nextLine();
            System.out.print("Your password : ");
            Scanner pass = new Scanner(System.in);
            password = pass.nextLine();

            if(name.equals("admin") && password.equals("admin")){

                System.out.println("Welcome back admin");
                System.out.println("You now allow to modify and see things that anyone else couldn't");
                A=2;
            }
            else{
                System.out.println("Welcome user") ;
                System.out.println("you are now our new user , thanks for trusting ");
                A=1;
            }

        }
        if (tap==2){

            System.out.print("Your name : ");
            Scanner nme = new Scanner(System.in);
            name =nme.nextLine();
            System.out.print("Your password : ");
            Scanner pass = new Scanner(System.in);
            password = pass.nextLine();
            System.out.print("Repeat password : ");
            Scanner repass = new Scanner(System.in);
            repassword = repass.nextLine();
            if(password.equals(repassword)){
                enter_users();
            }
            else {
                System.out.println("Your password is not matches !");

            }



        }

    }

    public  static void enter_users(){

        String name1 , password1 ;

        System.out.println("Now you are registed , enter your information");
        System.out.print("Your name : ");
        Scanner nme = new Scanner(System.in);
        name1 =nme.nextLine();
        System.out.print("Your password : ");
        Scanner pass = new Scanner(System.in);
        password1 = pass.nextLine();

        if(password1.equals(password) && name1.equals(name)){

            System.out.println("Welcome user") ;
            System.out.println("you are now our new user , thanks for trusting ");
            A=1;



        }
        else {
            System.out.println("You enter wrong information , try again ");
            A=0;
        }




    }
    public static void show_users(){

        System.out.println("name = "+name);
        System.out.println("passwowd = "+password);
    }
}

