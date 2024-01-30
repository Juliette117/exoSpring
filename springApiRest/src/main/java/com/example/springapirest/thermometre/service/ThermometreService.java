package com.example.springapirest.thermometre.service;

import com.example.springapirest.thermometre.Thermometre;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ThermometreService {


    public Thermometre getDefaultTemperature() {
        Thermometre thermometre = new Thermometre();
        thermometre.setCelcius(0);
        return thermometre;
    }

    public Thermometre getDefaultTemperatureFromCelsius(@RequestParam(defaultValue = "0") double temperature) {
        return this.getDefaultTemperature();
    }


    public Thermometre getTemperature(String unit, double value) {
        Thermometre temperature = this.getDefaultTemperature();

    }

    public double convertKelvinEnCelsius(double temperatureCelsius, double temperatureKelvin) {
        return temperatureCelsius +  273.15;
    }

    public double convertCelsiusEnFahreinheit(double temperatureFahreinheit, double temperatureCelcius) {
        return  (temperatureFahreinheit - 32) / 1.8;
    }

    public double convertCelsiusEnKelvin( double temperatureKelvin) {
        return  temperatureKelvin - 273.15;
    }



}
