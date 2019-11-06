package com.taxislibres.baseviewmodel;

public class CasoDeUso {

    public static String alCuadrado(String data){
        if(data.equals("")){
            return "Campo Vacio";
        }
        try {
            return String.valueOf(Double.valueOf(data) * Double.valueOf(data));
        }catch (Exception e){
            return "Dato no Valido";
        }
    }
}
