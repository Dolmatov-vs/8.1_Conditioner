package ru.netology.domain;

public class Conditioner {

    private int maxTemperature = 35;
    private int minTemperature = 5;
    private int currentTemperature;
    private boolean on;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }


    public void increaseCurrentTemperature(){
        if (!isOn()) return;
        if (currentTemperature >= maxTemperature)
            return;
        currentTemperature++;
    }

    public void decreaseCurrentTemperature(){
        if (!isOn()) return;
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }
}


