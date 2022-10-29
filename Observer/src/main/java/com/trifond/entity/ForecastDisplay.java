package com.trifond.entity;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 12:34
 * @ Description:
 */

import com.trifond.common.DisplayElement;
import com.trifond.common.Observer;
import com.trifond.common.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject data) {
        weatherData = data;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Forecast: Improving weather on the way");
        log.info("Current conditions: {}F degrees and {}% humidity and pressure is {}", temperature, humidity, pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
