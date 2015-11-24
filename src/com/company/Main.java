package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        String inputArr [] = new String[4];
        int count = 0;

       Treasure myTreasure = new Treasure(Colors.BLUE.toString(), Colors.GREEN.toString(),Colors.BLUE.toString(), Colors.RED.toString());

        System.out.println("Start");
       while (count<4) {

           System.out.println("Hadej barvy");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           String input = br.readLine();



           switch (input) {
               case "B":
                   inputArr[count] = Colors.BLUE.toString();
                   count++;
                   break;
               case "G":
                   inputArr[count] = Colors.GREEN.toString();
                   count++;
                   break;
               case "R":
                   inputArr[count] = Colors.RED.toString();
                   count++;
                   break;
               case "Y":
                   inputArr[count] = Colors.YELLOW.toString();
                   count++;
                   break;
               case "P":
                   inputArr[count] = Colors.PINK.toString();
                   count++;
                   break;
               case "O":
                   inputArr[count] = Colors.ORANGE.toString();
                   count++;
                   break;
               default:
                   break;
           }
       }
        CompareManager manager = new CompareManager(inputArr[0],inputArr[1], inputArr[2], inputArr[3], myTreasure);

        }

    }

