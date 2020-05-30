package ru.netology.domain;

import javax.crypto.spec.PSource;

public class Conditioner {

    private int maxTemperature = 35;
    private int minTemperature = -35;
    private int currentTemperature;
    private boolean on;
    private boolean status;     // true - температура вверх, false - температура вниз

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


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > getMaxTemperature()) {
            this.currentTemperature = getMaxTemperature();
            return;
        }
        if (currentTemperature < getMinTemperature()) {
            this.currentTemperature = getMinTemperature();
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int temperature() {
        int temperature = getCurrentTemperature();
            if (isOn() == true & isStatus() == true) {
                for (int i = getCurrentTemperature(); i <= getMaxTemperature(); i++) {
                    temperature = i;
                }
            }
            if (isOn() == true & isStatus() == false) {
                for (int i = getCurrentTemperature(); i >= getMinTemperature(); i--) {
                    temperature = i;
                }
            }
            return temperature;
    }

//    public void increaseCurrentTemperature(){
//        int increaseTemperature;
//        if (isStatus() == true & isOn() == true) {
//            for (int i = getCurrentTemperature(); i <= getMaxTemperature(); i++) {
//                increaseTemperature = i;
//            }
//        }
//
//    }
//    public void decreaseCurrentTemperature(){
//        int decreaseTemperature = getCurrentTemperature();
//        if (isStatus() == false & isOn() == true) {
//            for (int i = decreaseTemperature; i >= getMinTemperature(); i--) {
//                decreaseTemperature = i;
//            }
//        }
//    }
}


