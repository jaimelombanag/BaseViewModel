package com.taxislibres.baseviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelViewModel extends ViewModel {

    //LOGICA DE NEGOCIO DE LA APP Y MANEJO DE DATOS/ SE COMUNICA CON EL REPOSITORIO

    private MutableLiveData<String> resultado;

    public ViewModelViewModel(){
        resultado = new MutableLiveData<>();
    }

    public LiveData<String> getResultado(){
        return resultado;
    }

    public void alCuadrado(String data){
        resultado.setValue(CasoDeUso.alCuadrado(data));
    }

}
