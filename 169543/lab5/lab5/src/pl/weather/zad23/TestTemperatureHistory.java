package pl.weather.zad23;

import java.util.ArrayList;

public class TestTemperatureHistory {
    public static void main(String[] args) {
        TemperatureHistory temphist = new TemperatureHistory();
        ArrayList<Double> temps = new ArrayList<>();
        for(int i=0;i<5;i++){
            temps.add(i*1.1);
        }

        temphist.setTemperatures(temps);

        System.out.println(temphist.getTemperatures());

        temphist.addTemperature(6.5);
        temphist.addTemperature(1.3);
        temphist.removeTemperature(1);

        System.out.println(temphist.getTemperatures());

        System.out.println(temphist.averageTemperature());

    }
}
