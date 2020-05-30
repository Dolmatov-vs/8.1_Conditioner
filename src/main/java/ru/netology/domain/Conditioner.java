package ru.netology.domain;

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
        if (on == false)
            return;
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
        int additionTemperature = getCurrentTemperature();
        if (isStatus() == true & isOn() == true) {
            for (int i = additionTemperature; i <= getMaxTemperature(); i++) {
                additionTemperature = i;
            }
        }
        if (isStatus() == false & isOn() == true) {
            for (int i = additionTemperature; i >= getMinTemperature(); i--) {
                additionTemperature = i;
            }
        }
        return additionTemperature;
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


