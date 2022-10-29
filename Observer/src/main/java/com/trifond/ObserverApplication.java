package com.trifond;

/*
 * @ Author: Felix
 * @ Date: 2022/10/29 12:20
 * @ Description:
 */

import com.trifond.observer.CurrentConditionsDisplay;
import com.trifond.observer.ForecastDisplay;
import com.trifond.subject.WeatherData;

public class ObserverApplication {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(data);
        ForecastDisplay forecastDisplay = new ForecastDisplay(data);


        data.setMeasurements(80,65, 30.4f);
        data.setMeasurements(78, 70, 29.2f);
        data.setMeasurements(83, 90, 32.3f);
    }

}
