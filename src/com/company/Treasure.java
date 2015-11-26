package com.company;

/**
 * Created by Jakub Janoušek on 24. 11. 2015.
 */
public class Treasure {
    private Colors color1;
    private Colors color2;
    private Colors color3;
    private Colors color4;

    public Treasure(Colors color1, Colors color2, Colors color3, Colors color4) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
    }

    public Colors getColor1() {
        return color1;
    }

    public void setColor1(Colors color1) {
        this.color1 = color1;
    }

    public Colors getColor2() {
        return color2;
    }

    public void setColor2(Colors color2) {
        this.color2 = color2;
    }

    public Colors getColor3() {
        return color3;
    }

    public void setColor3(Colors color3) {
        this.color3 = color3;
    }

    public Colors getColor4() {
        return color4;
    }

    public void setColor4(Colors color4) {
        this.color4 = color4;
    }
}
