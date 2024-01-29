package com.example.springapirest.thermometre.service;

import com.example.springapirest.thermometre.Thermometre;
import org.springframework.stereotype.Service;

@Service
public class ThermometreService {


    public Thermometre getTemperature() {
        Thermometre thermometre = new Thermometre();
        thermometre.setCelcius(0);
        return thermometre;
    }


    public double convertFahreinheitEnCelsius(double temperatureCelsius) {
        return temperatureCelsius * 1.8 + 32;

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
