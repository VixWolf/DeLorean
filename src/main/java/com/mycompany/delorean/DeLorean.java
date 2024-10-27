/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.delorean;

import java.util.Scanner; 

public class DeLorean {
 public static void result1(int meow, String bark, int moo) {
        System.out.print(bark + " ");
        if (moo < 10) {
            System.out.print("0" + moo + ", ");
        }
            else {
            System.out.print(moo + ", ");
        }
        if (meow < 10) {
            System.out.print("000" + meow + " at ");
                }
        else if (meow < 100) {
            System.out.print("00" + meow + " at ");
        }
        else if (meow < 1000) {
            System.out.print("0" + meow + " at ");
        }
        else {
            System.out.print(meow + " at ");
        }
    }
    
    public static void result2(int chirp, int oink, String caw) {
        if (chirp < 10) {
            System.out.print("0" + chirp + ":");
                }
        else {
            System.out.print(chirp + ": ");
        }
        if (oink < 10) {
            System.out.print("0" + oink + " " + caw);
                }
        else {
            System.out.print(oink + " " + caw);
        }
    }

  public static void main(String[] args) {
    Scanner scnr = new Scanner (System.in);
    int var = 0;
    int mph = 0;
    String month = "DEC";
    int day = 0;
    int year = 0001;
    String time = "AM";
    int hour = 0;
    int minutes = 0;
//added new variables//

    
    System.out.print("Please input your speed (mph): ");
    mph = scnr.nextInt(); 
    System.out.println("");
    //Removed Print ("Enjoy your road trip!"), added a newline.//

    if (mph < 88) {
        while (mph < 88) {
        if(mph<0) {
            System.out.println("According to science, the DeLorean, like any other car, cannot move at a negative speed! ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
        }
        
        
            if(mph==0) {
               System.out.println("The DeLorean did not  at a speed of " + mph + " mph as the DoLorean was being revealed for the first time to Marty McFly at the Pines Mall parking lot in 1985. (Back to the Future I, 1985) ");
               System.out.print("Enter a new speed: ");
               mph = scnr.nextInt();
            }
            
            if (mph == 1 || mph == 2 ) {
                System.out.println("The DeLorean does not need to drive all the time, try 3mph! ");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 3 || mph == 4 ) {
                System.out.println("The DeLorean in 1985 reveresed out of a trailer, feel free to speed up, try 5mph! ");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==5) {
            System.out.println("The DeLorean drove at a speed of " + mph + " mph as the DoLorean reversed out of the trailer for the car's introductory scene at the Pines Mall parking lot in 1985. (Back to the Future I, 1985) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 6 || mph == 7 ) {
                System.out.println("The DeLorean loves increments of fives, try 8mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 8 || mph == 9 ) {
                System.out.println("The DeLorean is tired of 1885, but not that tired, try 10mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==10) {
            System.out.println("The DeLorean drove at a speed of " + mph + " as the DoLorean cruised on train tracks after its time travel from being ran into by a train in 1885. (Back to the Future III, 1989) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 11 || mph == 12 ) {
                System.out.println("The DeLorean is ready to speed up, just not yet, try 13mph! ");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 13 || mph == 14 ) {
                System.out.println("The DMC-12 is made of stainless steel, lets test drive it, try 15mph! ");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==15) {
            System.out.println("The DeLorean drove at a speed of " + mph + " mph as the DoLorean took a test drive through the Pine Malls parking lot in 1985. (Back to the Future I, 1985) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 16 || mph == 17 ) {
                System.out.println("The DeLorean needs more test driving, try 18mph! ");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 18 || mph == 19 || mph == 20) {
                System.out.println("This is the rev stage of the DeLorean, give it some gas! Try 21mph! ");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 21 || mph == 22 || mph == 23) {
                System.out.println("Don't let Usian Bolt beat you, try 24mph! ");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 24 || mph == 25) {
                System.out.println("There you go, your picking up speed! Try 26mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 26 || mph == 27) {
                System.out.println("PRESS THE GAS! Try 30mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 28 || mph == 29 || mph == 30) {
                System.out.println("PRESS THE GAS MORE! Try 31mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
             
            if (mph == 31 || mph == 32) {
                System.out.println("MORE MORE MORE! Try 33mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 33 || mph == 34) {
                System.out.println("ALMOST THERE!! Try 35mph");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==35) {
            System.out.println("The DeLorean drove at a speed of " + mph + " mph as it approached antagonist, Biff's car, in attempt to retrieve the sports almanac in 1955. (Back to the Future II, 1989) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 36 || mph == 37) {
                System.out.println("Were on an adventure, lets go faster! Try 38mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 38 || mph == 39) {
                System.out.println("Keep on going, you're doing great! Try 40mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 40 || mph == 41) {
                System.out.println("Go Go Go! Try 42mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 42 || mph == 43 || mph == 44) {
                System.out.println("Next DeLorean fact up next! Try 45mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==45) {
            System.out.println("The DeLorean drove at a speed of " + mph + " mph in attempts to escape the Native Americans riding on horse-back in Old West 1885. (Back to the Future III, 1990) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 46 || mph == 47 || mph == 48 || mph == 49) {
                System.out.println("Whew that was close! Time to cruise, try 50mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==50) {
            System.out.println("The DeLorean flew at a speed of " + mph + " mph speeding through time to the future Hill Valley California arriving in 2015 (Back to the Future II, 1989) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 51 || mph == 52 || mph == 53 || mph == 54) {
                System.out.println("It's getting interesting now, but were a little over half way, try 55mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==55) {
            System.out.println("The DeLorean drove at a speed of " + mph + " mph as Marty teleported back in time to 1955 and crashed into a farmer's barn. (Back to the Future I, 1985) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 56 || mph == 57 || mph == 58 || mph == 59) {
                System.out.println("Crashing into a barn happens pretty often, keep on speeding up, try 60mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph==60) {
            System.out.println("The DeLorean flew at a speed of " + mph + " mph after knocking out Biff on top of his hotel from an altered timeline in 1985. (Back to the Future II, 1989) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 61 || mph == 62 || mph == 63 || mph == 64) {
                System.out.println("The DeLorean is so versitile it can even knock out bad guys! Try 65mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 65) {
            System.out.println("The DeLorean drove at a speed of " + mph + " mph as the DoLorean accelerated to teleported the world's first time traveler, Doc Brown's dog, Einstein in 1985. (Back to the Future I, 1985) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 66 || mph == 67 || mph == 68 || mph == 69) {
                System.out.println("The DeLorean treats dogs very well, go Einstein! Try 70mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 70) {
            System.out.println("The DeLorean flew at a speed of " + mph + " mph as it traveled to the future, 2015, where Doc Brown put a sleeping device on Jennifer. (Back to the Future II, 1989) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 71 || mph == 72 || mph == 73 || mph == 74 || mph == 75 || mph == 76 || mph == 77 || mph == 78 || mph == 79) {
                System.out.println("You know Jennifer deserved to be put to sleep, there was no need to panic, time traveling is normal! And the DeLorean would agree. Try 80mph!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 80) {
            System.out.print("The DeLorean was pushed at a speed of " + mph + " mph when the locomotive ran into the DoLorean pushing it to 80 eventually fast enough to teleport from 1885 back to 1985. (Back to the Future III, 1990) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 81 || mph == 82 || mph == 83 || mph == 84) {
                System.out.println("The DeLorean is getting there and you know it, keep speeding up, FOUR mph AWAY FROM TELEPORTING. The locomotive is forever in the DeLorean's debt for the help. Try 85mph!!");
                System.out.print("Enter a new speed: ");
                mph = scnr.nextInt();
            }
            
            if (mph == 85) {
            System.out.println("The DeLorean drove at a speed of " + mph + " mph as it approached top speed in order for the clocktower lighting strike to teleport Marty back to 1985. (Back to the Future I, 1985) ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            
            if (mph == 86) {
            System.out.println("THE DELOREAN NEEDS A LITTLE MORE GAAS TO TELEPORT!!! ");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
            if (mph == 87) {
            System.out.print("THE DELOREAN NEEDDS ONE MORE mph TO TELEPORT!! GO!!!");
            System.out.print("Enter a new speed: ");
            mph = scnr.nextInt();
            }
    }
    
    if(mph >= 88){
        System.out.println("");
        System.out.println("HERE WE GO!!!");
        System.out.println("LET'S TIME TRAVEL!!");
        System.out.println("");

    do {
      System.out.print("DeLorean version (1-3): ");
      var = scnr.nextInt();
      if ((var < 1) || (var > 4)) {
                System.out.println("Invalid input. Try again.");
            }
        } while ((var < 1) || (var > 4));

      do {
        System.out.print("What month are you traveling to? (XXX): ");
        month = scnr.next();
        if ((!month.equals("JAN")) && (!month.equals("FEB")) && (!month.equals("MAR")) && (!month.equals("APR")) && (!month.equals("MAY")) && (!month.equals("JUN")) && (!month.equals("JUL")) && (!month.equals("AUG")) && (!month.equals("SEP")) && (!month.equals("OCT")) && (!month.equals("NOV")) && (!month.equals("DEC"))) {
            System.out.println("Invalid input. Try again (MAKE SURE LETTERS ARE CAPITALIZED)");
        }
      } while ((!month.equals("JAN")) && (!month.equals("FEB")) && (!month.equals("MAR")) && (!month.equals("APR")) && (!month.equals("MAY")) && (!month.equals("JUN")) && (!month.equals("JUL")) && (!month.equals("AUG")) && (!month.equals("SEP")) && (!month.equals("OCT")) && (!month.equals("NOV")) && (!month.equals("DEC")));

      do {
         System.out.print("What day are we traveling to? ");
        day = scnr.nextInt();
        if ((day < 1) || (day > 32)) {   
        System.out.println("Invalid input. Try again.");
        }
      } while ((day < 1) || (day > 32));

      do {
          System.out.print("What year is it?: ");
        year = scnr.nextInt();
        if ((year <= -1) || (year > 9999)) {
        System.out.println("Invalid input. Try again.");
        }
      } while ((year < 0) || (year > 9999));

      do {
        System.out.print("AM or PM? ");
        time = scnr.next();
        if ((!time.equals("AM"))&&(!time.equals("PM"))){
            System.out.println("Invalid input. Try again.");
        }
      } while ((!time.equals("AM"))&&(!time.equals("PM")));

      do {
         System.out.print("What hour? ");
        hour = scnr.nextInt();
        if ((hour < 1) || (hour > 12)) {
            System.out.println("Invalid input. Try again.");
        }
      } while ((hour < 1) || (hour > 12));

      do {
        System.out.print("What was the exact minute (because it matters)? ");
        minutes = scnr.nextInt();
        if ((minutes < 0) || (minutes >= 60)) {
            System.out.println("Invalid input. Try again.");
        }
      } while ((minutes < 0) || (minutes >= 60));
      
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");


      System.out.println("Month  " + "  Day   " + "   Year   " + "   AM " + " Hour " + "   Min" );
      System.out.println(month   + "     " +  day  + "       " +  year + "          " + hour + "     " + ":"  +  minutes);
      System.out.println("Destination Time");
    }

 if (var == 1) {
        System.out.println("                                                                                                                                                      ");
        System.out.println("                                                                                                        |-|------|                      ___   _________           ");
        System.out.println("                                                                      <^____________________________________||||______               __/ /#\\/ /########\\         ");
        System.out.println("                                                                       *--**************************||4884************\\__(((())))__/ /###/ /############\\        ");
        System.out.println("                                                                  *--*******************************||4884*****************\\2222/ /###/ /################\\       ");
        System.out.println("                                                           *--****//                              |*||4884*|   You've         \\****\\/ /#################||    ");
        System.out.println("                                                     *----***//          _________________        |*||4884*|    returned to:    \\**/ /##################//   ");
        System.out.print("                                               *--**X-(XXXXXX)|         /                \\       /**||4884*|     ");
        result1(year, month, day);
        System.out.println("   \\*****\\############//     ");
        System.out.print("           ________________________________--*****XX--(XXXXXX)|________/__________________\\_____/***||4884*|______");
        result2(hour, minutes, time);
        System.out.println("________|****************#//       ");
        System.out.println("      /|########################################**\\***********************************************//**4884****************************************|##~}        ");
        System.out.println("   /###|*******************************************\\****************************************O****//****488888888888888888888888888884*************|##~}        ");
        System.out.println("|######|********************************************\\******************************************//*****************************4888888884**********|##~}        ");
        System.out.println("|######|**************XXXXXXXXXXX********************\\****************************************//**********************XXXXXXXXXXXX*****488884*****|#####|       ");
        System.out.println(" ###7777777######||XXXXXXXXXXXXXXX||##################\\#################################UUUU*//###################||XXXXXXXXXXXXXXXX||######48884*|#####|       ");
        System.out.println("     \\********||XXXXXXXXXXXXXXXXXXX||*****************\\***********************************//*******************||XXXXXXXXXXXXXXXXXXX||*****48884####|       ");
        System.out.println("      /######||XXXXXXXX000000XXXXXXXXX||****************\\*********************************//******************||XXXXXXXXX000000XXXXXXXX||######48884/        ");
        System.out.println("     /#######||XXXXXXXX000000XXXXXXXXX||#################\\####################################################||XXXXXXXXX000000XXXXXXXX||#########/          ");
        System.out.println("    /########||XXXXXXXX000000XXXXXXXXX||#######################################################################||XXXXXXXXX000000XXXXXXXX||#######/            ");
        System.out.println("               \\XXXXXXXXXXXXXXXXXXX||###########################################################################\\XXXXXXXXXXXXXXXXXXX||                      ");
        System.out.println("                 \\XXXXXXXXXXXXXXX||                                                                               \\XXXXXXXXXXXXXXX||                        ");
        System.out.println("                   \\XXXXXXXXXXX||                                                                                   \\XXXXXXXXXXX||                          ");
         }
         if (var == 2) {
             System.out.println("                                                                                                                            _--_                      ");
        System.out.println("                                                                                                        |-|------|         <||||>       ___   _________           ");
        System.out.println("                                                                      <^____________________________________||||______     <||||>    __/ /#\\/ /########\\         ");
        System.out.println("                                                                       *--**************************||####************\\__(((())))__/ /###/ /############\\        ");
        System.out.println("                                                                  *--*******************************||####*****************\\4884/ /###/ /################\\       ");
        System.out.println("                                                           *--****//                              |*||####*|         ==+[####]+\\****\\/ /#################||    ");
        System.out.println("             You've returned to:                     *----***//           ________________        |*||####*|   //====//+[####]+   \\**/ /#################//   ");
        System.out.print("                    ");
        result1(year, month, day);
        System.out.println("              *--**X-(XXXXXX)|        /               \\       /**||\\######//       +[####]+       \\**\\##############//     ");
        System.out.print("           _____________");
        result2(hour, minutes, time);
        System.out.println("___________--*****XX--(XXXXXX)|_________/_________________\\____ /***||###\\##//_______________________||**************#//       ");
        System.out.println("      /|########################################**\\***********************************************//**####****************************************|##~}        ");
        System.out.println("   /###|*******************************************\\****************************************O****//****##############################*************|##~}        ");
        System.out.println("|######|****##########################**************\\*******************************************//*****####********************##########*********|##~}        ");
        System.out.println("|######[][][]##******XXXXXXXXXXX*****#####***********\\*****************************************//****####**************XXXXXXXXXXXX*****######****|#####|       ");
        System.out.println(" ###777[]##[]####||XXXXXXXXXXXXXXX||#################*\\###################################UUUU//###################||XXXXXXXXXXXXXXXX||###########|#####|       ");
        System.out.println("     \\[][][]**||XXXXXX======XXXXXXX||****####*********\\*************************************//**####************||XXXXXXX======XXXXXXX||*****#########|       ");
        System.out.println("      /######||XXXXXX//OOOOOO\\XXXXXXX||****####********\\***********************************//*####************||XXXXXXX//OOOOOO\\XXXXXXX||###########/        ");
        System.out.println("     /#######||XXXXXX||OOOOOO||XXXXXXX||#################\\#####################################################||XXXXXXX||OOOOOO||XXXXXXX||#########/          ");
        System.out.println("    /########||XXXXXX\\OOOOOO//XXXXXXX||########################################################################||XXXXXXX\\OOOOOO//XXXXXXX||#######/            ");
        System.out.println("               \\XXXXXX======XXXXXXX||#####################[<><><><><><><><><><><><><><><><>]#####################\\XXXXXXX======XXXXXXX||                      ");
        System.out.println("                 \\XXXXXXXXXXXXXXX||                                                                                \\XXXXXXXXXXXXXXXX||                        ");
        System.out.println("                   \\XXXXXXXXXXX||                                                                                    \\XXXXXXXXXXXX||                          ");        
         }
         if (var == 3) {
             System.out.println("                                                                                                                            _--_                      ");
        System.out.println("                                                                You've travelled to:                    |-|------|         <||||>       ___   __________           ");
        System.out.println("                                                                      <^____________________________________||||______     <||||>    __/ /#\\/ /#########\\         ");
        System.out.println("                                                                       *--**************************||####************\\__(((())))__/ /###/ /#############\\        ");
        System.out.println("                                                                  *--*******************************||####*****************\\4884/ /###/ /#################\\       ");
        System.out.print("                         <========________                 *--****//   ");
        result1(year, month, day);
        System.out.println("           |*||####||_O_||_O_||_O_|---+[####]+\\/ /################||    ");
        System.out.print("          ___________  _[]_ ______|______|____         *----***//         _____");
        result2(hour, minutes, time);
        System.out.println("____      |*||####*||||  |||  |||----+[####]+\\/ /###############//   ");
        System.out.println("          |     ____|_(___ )__|    ____       |     *--**X-(XXXXXX)|     /                  \\   /*||\\###  |||  |||  ||| ----+[####]+\\##################//     ");
        System.out.println("         (|_____|  |_____________|  |_____|--*****XX--(XXXXXX)|_________/____________________\\_/**||####\\(___)(___)(___) ___________________||*******#//       ");
        System.out.println("      /|########################################**\\***********************************************//**####****************************************|##~}        ");
        System.out.println("   /###|*******************************************\\****************************************O****//****##############################*************|##~}        ");
        System.out.println("|######|****##########################**************\\*******************************************//*****####********************##########*********|##~}        ");
        System.out.println("|######[][][]##******XXXXXXXXXXX*****#####***********\\*****************************************//****####**************XXXXXXXXXXXX*****######****|#####|       ");
        System.out.println(" ######[]##[]####||XX           XX||#################*\\###################################UUUU//###################||XX            XX||###########|#####|       ");
        System.out.println("     \\[][][]**||XX    ======     XX||****####*********\\*************************************//**####************||XX     ======     XX||*****#########|       ");
        System.out.println("     /######||XX     //OOOOOO\\     XX||****####********\\***********************************//*####************||XX     //OOOOOO\\     XX||###########/        ");
        System.out.println("    /#######||XX     ||OOOOOO||     XX||#################\\#####################################################||XX     ||OOOOOO||     XX||#########/          ");
        System.out.println("   /########||XX     \\OOOOOO//     XX||########################################################################||XX     \\OOOOOO//     XX||#######/            ");
        System.out.println("              \\XX     ======     XX||#####################[<><><><><><><><><><><><><><><><>]#####################\\XX     ======     XX||                      ");
        System.out.println("                \\XX            XX||                                                                                \\XX            XX||                        ");
        System.out.println("                  \\XXXXXXXXXXXX||                                                                                     \\XXXXXXXXXXXX||                          ");
         }
         System.out.println("");
         System.out.println("We made it!!");
         System.out.println("");
         
         if ((year == 2001) && (month.equals("SEP")) && (day == 11)) {
             System.out.println("September 11, 2001. A tragic day in history...");
         }
         
         if ((year == 1776) && (month.equals("JUL")) && (day == 4)) {
             System.out.println("July 4, 1776. The day the Declaration of Independence was signed!");
         }
         if ((year == 2006) && (month.equals("JUN")) && (day == 2)) {
             System.out.println("June 2, 2006. This is Jan's birthday!");
         }
         if((year == 2005) && (month.equals("JUN")) && (day == 8)){
             System.out.println("June 8, 2005. This is Michael's birthday!");
         }
             
         if((year == 2006) && (month.equals("FEB")) && (day == 12)){
             System.out.println("February 12, 2006. This is Hayden's birthday!");
         }
             
         if ((year == 1955) && (month.equals("NOV")) && (day == 5)) {
              System.out.println("November 5, 1955. This is the date that MArty first travelled to in the first movie!");
        }
        if ((year == 1985) && (month.equals("NOV")) && (day == 5)) {
            System.out.println("November 5, 1985. This is the date when Marty first travelled to the past!");
        }
        if ((year == 0000) && (month.equals("DEC")) && (day == 25)) {
            System.out.println("December 25, 0000. The birth of Jesus Christ!");
        }
        if ((month.equals("OCT")) && (day == 31)) {
            System.out.println("Happy Halloween!");
        }
        if ((year == 2015) && (month.equals("OCT")) && (day == 21)) {
            System.out.println("October 21, 2015. This is when Marty, Doctor Brown, and Jennifer traveled to the future! Definitely wasn't accurate though...");
        }
        if ((year == 2006) && (month.equals("JAN")) && (day == 19)) {
            System.out.println("January 19, 2006. This is Zander's birthday!");
        }
    }
  }
}