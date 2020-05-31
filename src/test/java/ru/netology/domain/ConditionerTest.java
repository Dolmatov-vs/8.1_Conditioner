package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(34);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
    }

    @Test
    void сurrentTemperatureEquaMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    void сurrentTemperatureMoreMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(36);
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(6);
        conditioner.decreaseCurrentTemperature();
        assertEquals(5, conditioner.getCurrentTemperature());
    }

    @Test
    void сurrentTemperatureEquaMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    void сurrentTemperatureLessMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(4);
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureConditionerIsOFF() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(false);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
        assertEquals(false, conditioner.isOn());
    }

    @Test
    void decreaseCurrentTemperatureConditionerIsOFF() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(false);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
        assertEquals(false, conditioner.isOn());
    }
}