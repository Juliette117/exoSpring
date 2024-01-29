package com.example.springapirest.thermometre.controller;

import com.example.springapirest.thermometre.Thermometre;
import com.example.springapirest.thermometre.service.ThermometreService;
import org.springframework.web.bind.annotation.*;
import com.example.springapirest.thermometre.dto.ThermometreDto;


@RestController
@RequestMapping("/temperature")
public class ThermometreController {

    private final ThermometreService thermometreService;

    public ThermometreController(ThermometreService thermometreService) {
        this.thermometreService = thermometreService;
    }



    @GetMapping()
    public Thermometre getTemperature() {
        return thermometreService.getTemperature();
    }

    @PostMapping("/convertFahreinheitEnCelsius")
    public double convertFahreinheitEnCelsius(@RequestBody ThermometreDto thermometreDto) {
        return thermometreService.convertFahreinheitEnCelsius(
                thermometreDto.getTemperatureCelsius()
        );
    }

    @PostMapping("/convertKelvinEnCelcius")
    public double convertKelvinEnCelcius(@RequestBody ThermometreDto thermometreDto) {
        return thermometreService.convertKelvinEnCelsius(
                thermometreDto.getTemperatureCelsius(),
                thermometreDto.getTemperatureKelvin()
        );
    }

    @PostMapping("/convertCelsiusEnFahreinheit")
    public double convertCelsiusEnFahreinheit(@RequestBody ThermometreDto thermometreDto) {
        return thermometreService.convertCelsiusEnFahreinheit(
                thermometreDto.getTemperatureFahreinheit(),
                thermometreDto.getTemperatureCelsius()

        );
    }


}
