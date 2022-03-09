package com.qa.solid.interfaceSegregation.exercise;

public class Dodo implements EggLaying, Extinct {
	
    private String currentLocation;
    private int numberOfEggs;

    public Dodo(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }

    // layEggs gets the current number of eggs, and adds 1 
    // we set the numberOfEggs to the new value (old value + 1)
    @Override
    public void layEggs() {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
    }

    @Override
    public void goExtinct() {
        this.setCurrentLocation("in a museum");
    }

    // Getters and Setters
    
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

}
