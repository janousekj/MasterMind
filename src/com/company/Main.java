package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int NUM_OF_PIECES = 4;

    public static void main(String[] args) throws IOException {

        Color inputArr [] = new Color[NUM_OF_PIECES];
        int count = 0;

        List<Color> colorList = new ArrayList<>();

        colorList.add(Color.BLUE);
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.ORANGE);

        Treasure myTreasure = new Treasure(colorList);

        System.out.println("Start");

       while (count < NUM_OF_PIECES) {

           System.out.println("Hadej barvy");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           String input = br.readLine();

           switch (input) {
               case "B":
                   inputArr[count] = Color.BLUE;
                   break;
               case "G":
                   inputArr[count] = Color.GREEN;
                   break;
               case "R":
                   inputArr[count] = Color.RED;
                   break;
               case "Y":
                   inputArr[count] = Color.YELLOW;
                   break;
               case "P":
                   inputArr[count] = Color.PINK;
                   break;
               case "O":
                   inputArr[count] = Color.ORANGE;
                   break;
               default:
                   break;
           }

           count++;
       }
//        CompareManager manager = new CompareManager(inputArr[0],inputArr[1], inputArr[2], inputArr[3], myTreasure);

        }

    }

