package com.example.springapirest.calculatrice;

import org.springframework.stereotype.Service;

@Service
public class CalculatriceService {

    public int additionner(int premierNombre, int secondNombre) {
        return premierNombre + secondNombre;
    }

    public int soustraire(int premierNombre, int secondNombre) {
        return premierNombre - secondNombre;
    }

    public int multiplier(int premierNombre, int secondNombre) {
        return premierNombre * secondNombre;
    }

    public int diviser(int premierNombre, int secondNombre) {
        return premierNombre / secondNombre;
    }
}
