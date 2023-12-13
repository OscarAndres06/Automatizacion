package com.haceb.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;



public class Data {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
//        ruta de excel se saca de data y en la hoja de ruta se coloca el nombre de la pestaña del excel
        try {
            data= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataHaceb.xlsx","RegistroHaceb");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
