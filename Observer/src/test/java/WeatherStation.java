/*
 * @ Author: Felix
 * @ Date: 2022/10/29 12:11
 * @ Description:
 */

import com.trifond.observer.CurrentConditionsDisplay;
import com.trifond.subject.WeatherData;
import org.junit.jupiter.api.Test;

public class WeatherStation {

    @Test
    public void Test1() {
        WeatherData data = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(data);


        data.setMeasurements(80,65, 30.4f);
        data.setMeasurements(78, 70, 29.2f);
        data.setMeasurements(83, 90, 32.3f);
    }


}
