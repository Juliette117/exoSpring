package com.example.springapirest.thermometre.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class ThermometreDto {

    private double value;

    private String unit;

}
