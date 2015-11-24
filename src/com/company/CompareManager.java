package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 24. 11. 2015.
 */
public class CompareManager {
    private static String color1;
    private static String color2;
    private static String color3;
    private static String color4;
    private static Treasure myTreasure;
    private static int matchColors;
    private static int matchPositions;
    private static int attempt;

    public CompareManager(String color1, String color2, String color3, String color4, Treasure myTreasure) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
        this.myTreasure = myTreasure;
        this.attempt = attempt;
        this.Logic();

    }

    public static void Logic(){
       String userInput[] = new String[] {color1,color2,color3,color4};
       String mind [] = new String[]{myTreasure.getColor1(),myTreasure.getColor2(),myTreasure.getColor3(), myTreasure.getColor4()};

        for (int i = 0; i<userInput.length; i++){

          if (userInput[i] == mind [i]){
              matchPositions++;
          }
        }
        List<Integer> alreadyMatch = new ArrayList<Integer>();

        for (String color : mind){
            for (int i=0; i<userInput.length;i++){
                if (color==userInput[i] && !alreadyMatch.contains(i)){
                    alreadyMatch.add(i);
                    matchColors++;
                    break;
                }
            }
        }

        matchColors-=matchPositions;

        System.out.println("Trefil jsi " + matchColors + " barev " + " a " + matchPositions + " presnych pozic");

        if (matchPositions == 4){
            System.out.println("You are the mastermind!");
            System.exit(5);
        }else {
            attempt++;
        }

        if (attempt>=10){
            System.out.println("Prohral jsi!");
            System.exit(5);
        }

    }

}
