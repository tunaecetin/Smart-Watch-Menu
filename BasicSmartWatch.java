/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class BasicSmartWatch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is your SMARTWATCH how can I help you?");

        System.out.println("[1] Cloak and Time");
        System.out.println("[2] Stopwatch");
        System.out.println("[3] Phone Function");
        System.out.println("[4] Games and Activities");
        System.out.println("[5] For close.");

        int select = input.nextInt();

        if (select > 0 && select <= 5) {
            while (select <= 4 && select > 0) {

                switch (select) {
                    case 1: //Clock and Time
                        Long time = System.currentTimeMillis();
                        Long timehour = (time / (60 * 60 * 1000) % 24) + 3;
                        Long timeminute = time / (1000 * 60) % 60;

                        System.out.println("\nCurrent time is: " + "(" + timehour + ":" + timeminute + ")");

                        break;
                    case 2: // Stopwatch
                        System.out.println("\n\tStopwatch Menu:");
                        System.out.println("[1] Start");
                        System.out.println("[2] Stop");
                        System.out.println("[3] Restart");
                        System.out.println("[0] Go back");
                        int stopwatch = input.nextInt();
                        Long baslangic = System.currentTimeMillis();
                        Long bitis;
                        double gecensure = 0;

                        if (stopwatch >= 0 && stopwatch <= 3) {
                            while (stopwatch > 0 && stopwatch <= 3) {

                                if (stopwatch == 1) {
                                    baslangic = System.currentTimeMillis();
                                    System.out.println("Stopwatch started.");
                                } else if (stopwatch == 2) {
                                    bitis = System.currentTimeMillis();
                                    gecensure += bitis - baslangic;
                                    System.out.println("Elapsed Time " + "(" + gecensure / 1000 + ")" + "seconds.");

                                } else if (stopwatch == 3) {
                                    System.out.println("Stopwatch reset , (00.00).");
                                    gecensure = 0;
                                }

                                System.out.println("\n\tStopwatch Menu:");
                                System.out.println("[1] Start");
                                System.out.println("[2] Stop");
                                System.out.println("[3] Restart");
                                System.out.println("[0] Go back");

                                stopwatch = input.nextInt();

                            }
                        } else {
                            System.exit(0);
                        }

                        break;

                    case 3:// Phone Function
                        System.out.println("\n\tPhone Functions:");
                        System.out.println("[1] Call");
                        System.out.println("[2] Text a message");
                        System.out.println("[3] Call Log");
                        System.out.println("[4] Message Log");
                        System.out.println("\n\tContact Management:");
                        System.out.println("[5] Add");
                        System.out.println("[6] View");
                        System.out.println("[7] Edit");
                        System.out.println("[8] Delete");
                        System.out.println("[0] Go back");
                        int phonefunc = input.nextInt();

                        if (phonefunc >= 0 && phonefunc <= 8) {

                            String rehber = "\n\tContact List";

                            int sira = 0;
                            String name = "";
                            String surname = "";
                            String phonenumber = "";
                            String message = null;
                            String call = "";
                            String messagetotal = "";
                            while (phonefunc > 0 && phonefunc <= 8) {
                                if (phonefunc == 1) {
                                    System.out.println(rehber);
                                    System.out.println("You can only call in your contact list.");
                                    System.out.println("Choose a contact.");
                                    sira = input.nextInt();
                                    if (sira == 1) {
                                        System.out.println("Calling " + name + " " + surname + " " + phonenumber);
                                        call += name + " " + surname + "- Missing Call" + "\n";
                                    }
                                } else if (phonefunc == 2) {
                                    System.out.println(rehber);
                                    System.out.println("You can only message in your contact list.");
                                    System.out.println("Choose a contact.");
                                    sira = input.nextInt();

                                    if (sira == 1) {
                                        System.out.println("Text message to: " + name + " " + surname + " " + phonenumber);
                                        System.out.println("Write your message");
                                        message = input.next();
                                        System.out.println("Message sent to " + name + "");
                                        messagetotal += "("+message +")" + " sent to " + name + " " + surname + "\n";
                                    }
                                } else if (phonefunc == 3) {
                                    System.out.println("\t Call Log");
                                    System.out.println(call);
                                } else if (phonefunc == 4) {
                                    System.out.println("\tMessage Log");
                                    System.out.println(messagetotal);
                                } else if (phonefunc == 5) {
                                    System.out.println("Enter name:");
                                    name = input.next();
                                    System.out.println("Enter surname:");
                                    surname = input.next();
                                    System.out.println("Enter a phone number: ");
                                    phonenumber = input.next();

                                    System.out.println(name + " " + surname + " " + phonenumber + " Successfully added.");
                                    sira++;
                                    rehber += "\n" + sira + " " + name + " " + surname + " " + phonenumber;

                                } else if (phonefunc == 6) {
                                    System.out.println(rehber);
                                } else if (phonefunc == 7) {

                                    System.out.println(rehber);
                                    System.out.println("Choose your contact to change:");
                                    
                                    int edit = input.nextInt();
                                    if (edit == 1) {
                                        System.out.println("Enter new name:");
                                        name = input.next();
                                        System.out.println("Enter new surname:");
                                        surname = input.next();
                                        System.out.println("Enter new phone number:");
                                        phonenumber = input.next();
                                        rehber = "\tContact List" + 
                                                "\n" + sira + " " + name + " " + surname + " " + phonenumber;
                                        System.out.println("Contact changed.");
                                    }
                                } else if (phonefunc == 8) {
                                    System.out.println("Choose the contact you want to delete:");
                                    int sil = input.nextInt();
                                    if (sil == 1) {
                                        rehber = "\n\tContact List";
                                        name = "";
                                        surname = "";
                                        phonenumber = "";
                                        message = "";
                                        call = "";
                                        System.out.println("Contact deleted.");
                                    }
                                }

                                System.out.println("\n\tPhone Functions:");
                                System.out.println("[1] Call");
                                System.out.println("[2] Text a message");
                                System.out.println("[3] Call Log");
                                System.out.println("[4] Message Log");
                                System.out.println("\n\tContact Management:");
                                System.out.println("[5] Add");
                                System.out.println("[6] View");
                                System.out.println("[7] Edit");
                                System.out.println("[8] Delete");
                                System.out.println("[0] Go back");

                                phonefunc = input.nextInt();

                            }
                        } else {
                            System.exit(0);
                        }

                        break;

                    case 4: //Game FUNCTION

                        System.out.println("\n\tGame Menu:");
                        System.out.println("[1] Guess Number");
                        System.out.println("[2] Rock Paper Scissor");
                        System.out.println("[0] Go back");
                        int game = input.nextInt();

                        if (game >= 0 && game <= 2) {
                            while (game > 0 && game <= 2) {

                                switch (game) {

                                    case 1:
                                        int randomnum = (int) (Math.random() * 10);
                                        System.out.println("Guess a natural number.");
                                        int guessnum = input.nextInt();

                                        if (guessnum == randomnum) {
                                            System.out.println("Perfect Guess , the number is: " + randomnum);
                                        } else if (guessnum >= 10 || guessnum < 0) {
                                            System.out.println("Invalid Number.");
                                        } else if (guessnum != randomnum) {
                                            System.out.println("Try again number was: " + randomnum);
                                        }
                                        break;

                                    case 2:
                                        int watchrps = 1 + (int) (Math.random() * 2);
                                        System.out.println("Rock:1 , Paper:2 , Scissors:3 ?");
                                        int rps = input.nextInt();

                                        if (rps == watchrps && watchrps == 1) {
                                            System.out.println("Tie , both picked Rock.");
                                        } else if (rps == watchrps && watchrps == 2) {
                                            System.out.println("Tie , both picked Paper.");
                                        } else if (rps == watchrps && watchrps == 3) {
                                            System.out.println("Tie , both picked Scissors.");
                                        } else if (rps == 1 && watchrps == 3) {
                                            System.out.println("You Win watch picked Scissor.");
                                        } else if (rps == 1 && watchrps == 2) {
                                            System.out.println("You Lost watch picked Paper.");
                                        } else if (rps == 2 && watchrps == 1) {
                                            System.out.println("You Win watch picked Rock.");
                                        } else if (rps == 2 && watchrps == 3) {
                                            System.out.println("You Lost watch picked Scissors.");
                                        } else if (rps == 3 && watchrps == 2) {
                                            System.out.println("You Win watch picked Paper.");
                                        } else if (rps == 3 && watchrps == 1) {
                                            System.out.println("You Lost watch picked Rock.");
                                        } else {
                                            System.out.println("Invalid choose.");
                                        }

                                }

                                System.out.println("\n\tGame Menu:");
                                System.out.println("[1] Guess Number");
                                System.out.println("[2] Rock Paper Scissor");
                                System.out.println("[0] Go back");
                                game = input.nextInt();

                            }
                        } else {
                            System.exit(0);
                        }

                }

                System.out.println("\n\tSmartwatch Menu:");

                System.out.println("[1] Cloak and Time");
                System.out.println("[2] Stopwatch");
                System.out.println("[3] Phone Function");
                System.out.println("[4] Games and Activities");
                System.out.println("[5] For close");

                select = input.nextInt();
            }
            if (select == 5) {
                System.out.println("Goodbye!");
            }
        } else {
            System.out.println("Invalid Choose!");
        }

    }
}
