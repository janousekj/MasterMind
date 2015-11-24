package com.company;

/**
 * Created by Jakub Janoušek on 24. 11. 2015.
 */
public enum Colors {

    RED("cervena"),
    BLUE("modra"),
    YELLOW("zluta"),
    GREEN("zelena"),
    PINK("ruzova"),
    ORANGE("oranzova");

    private String barva;

    private Colors(String barva){
        this.barva = barva;
    }
   public String toString(){
       return this.barva;
   }

}
