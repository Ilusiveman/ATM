package com.theironyard.novauc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome David!");

        if  (name.isEmpty()) {
            System.out.println("Name not entered.");
        }
        else if (name.isEmpty()) {
            System.out.println("Invalid name!");
        }
        {
            System.out.println("Would you like to check your balance?");

            System.out.println("Would you like to withdrawl funds?");

            System.out.println("Would you like to cancel?");

            System.out.println("Choose your answer [balance/withdraw/cancel]");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("balance")) {
                System.out.println("Your balance is 100");
            }
             if (answer.equalsIgnoreCase("cancel")); {
                System.out.println("Thankyou and please come again!");
            }
             if (answer.equalsIgnoreCase("withdraw")); {
                System.out.println("How much would you like to withdraw?");

              System.out.println("Choose amount you would like to withdraw [100/200}");
              String amount = scanner.nextLine();

              if (amount.equalsIgnoreCase("200")); {
                  System.out.println("insuffcuent funds");
            }
              if (amount.equalsIgnoreCase("100")); {
                  System.out.println("Please take your money");
            }
            else if {amount.isEmpty()
                 throw new Exception("Invalid");




            }


             }









        }





        }
























