package com.pcm.calculator.services;

import java.util.Objects;

public class  Opearation {


    private Opearation() {
    }

    public static double soma(double valor1, double valor2){

        if(Objects.isNull(valor1) || Objects.isNull(valor2)){

            throw new IllegalArgumentException("O valor inválido, verifica os parâmetros...");
        }

        return (valor1 + valor2);
    }

    public static double subtrair(double valor1, double valor2){

        if(Objects.isNull(valor1) || Objects.isNull(valor2)){

            throw new IllegalArgumentException("O valor inválido, verifica os parâmetros...");
        }

        return (valor1 - valor2);
    }


}
