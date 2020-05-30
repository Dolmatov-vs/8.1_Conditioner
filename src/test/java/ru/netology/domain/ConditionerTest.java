package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(10);
        conditioner.setStatus(true);
        assertEquals(conditioner.getMaxTemperature(), conditioner.temperature());
//        System.out.println(conditioner.temperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(10);
        conditioner.setStatus(false);
        assertEquals(conditioner.getMinTemperature(), conditioner.temperature());
    }

    @Test
    void сurrentTemperatureAboveNaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(36);
        conditioner.setStatus(true);
        assertEquals(conditioner.getMaxTemperature(), conditioner.temperature());
    }

    @Test
    void сurrentTemperatureBelowMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(-37);
        conditioner.setStatus(false);
        assertEquals(conditioner.getMinTemperature(), conditioner.temperature());
    }

//    @Test
//    void conditionerIsOFF() {
//        Conditioner conditioner = new Conditioner();
//        conditioner.setOn(false);
//        conditioner.setCurrentTemperature(-37);
//        conditioner.setStatus(false);
//        assertEquals(conditioner.getMinTemperature(), conditioner.additionTemperature());
//    }

}