package com.trifond.observer;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 12:06
 * @ Description:
 */

import com.trifond.element.DisplayElement;
import com.trifond.subject.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject data) {
        weatherData = data;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Current conditions: {}F degrees and {}% humidity", temperature, humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
