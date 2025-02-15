package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginAndSignUp {
    
    // define the login() methord
    public void login(){

    }

    // define the signup() methord
    public void signUp(){
        
    }

    // define the access() methord
    public void access(){
        // calling the Scanner
        Scanner input = new Scanner(System.in);
        // calling the class Object
        LoginAndSignUp loginAndSignUp =new LoginAndSignUp();

        // define the properties
        int choice =0;

        // define the do-while() statement
        do{
            try{
                System.out.println("*****WELCOME TO SHARMA CAR RENTAL*****\n"+
                                "**************************************\n"+
                                "   PRESS 1: login...\n"+
                                "   PRESS 2: signUp...\n"+
                                "   PRESS 3: exit\n"+
                                "**************************************");
                System.out.println("Enter the choice:");
                choice = input.nextInt();

                // define the switch()
                switch(choice){
                    case 1:
                    System.out.println("1");
                        loginAndSignUp.login();
                        break;
                    case 2:
                    System.out.println(2);
                        loginAndSignUp.signUp();
                        break;
                    case 3:
                        System.out.println("Quit...");
                        System.exit(0);
                        break; 
                    default:
                        System.out.println("NO such case available");
                        break;           
                }
        
            } 
            catch(InputMismatchException e){
                System.out.println("it only accept integer Datatype not any other");
                e.getMessage();
            }   

        }
        while(choice>0&& choice<4);

        // close the Scanner
        input.close();
    }
}
