package com.company;

/**
 * Created by semanticer on 3. 12. 2015.
 */
public final class CompareResult {
    public int correctColor;
    public int correctColorAndPlace;
    
    public CompareResult(int correctColor, int correctColorAndPlace) {
		this.correctColor = correctColor;
		this.correctColorAndPlace = correctColorAndPlace;
	}
	public int getCorrectColor() {
		return correctColor;
	}
	public int getCorrectColorAndPlace() {
		return correctColorAndPlace;
	}
	

    // TODO implement
}
