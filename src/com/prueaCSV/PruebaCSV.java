package com.prueaCSV;

public class PruebaCSV {



    public static void main(String[] args){

        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./Datos/pokemon.csv");
    }

}
