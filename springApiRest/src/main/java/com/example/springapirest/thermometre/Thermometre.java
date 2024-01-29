package com.example.springapirest.thermometre;

import lombok.Data;

@Data
public class Thermometre {

    private double kelvin;

    public double getCelsius() {
        return this.kelvin - 273.15;
    }

    public double getFahrenheit() {
        return this.kelvin * 9/5 - 459.67;
    }

    public void setCelcius(double celsius) {
        this.kelvin = celsius + 273.15;
    }

    public void setFahrenheit(double fahrenheit) {


    }
}
