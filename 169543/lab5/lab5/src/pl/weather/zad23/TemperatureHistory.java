package pl.weather.zad23;

import java.util.ArrayList;

class TemperatureHistory {

    private ArrayList<Double> temperatures;

    TemperatureHistory(){
        // konstruktor domyślny
    }

    ArrayList<Double> getTemperatures() {
        return temperatures;
    }

    void setTemperatures(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    void addTemperature(double temperature){
        this.temperatures.add(temperature);
    }

    void removeTemperature(int index){
        this.temperatures.remove(index);
    }

    double averageTemperature(){
        double avg = 0;
        for(double i : this.temperatures){
            avg += i;
        }

        return avg/this.temperatures.size();
    }

}
