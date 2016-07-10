package com.example.abele.calculadora.Botones;

import com.example.abele.calculadora.R;

/**
 * Clase que maneja los digitos seleccionados por el usuario.
 * Created by abele on 20/06/2016.
 */

public class Digito extends Boton{

    private int id;


    /**
     * Método que recibe y evalua el ID del digito seleccionado.
     * @return Retorna un número entre el 0 y 9 según corresponda con el digito seleccionado.
     */
    @Override
    public int getId(){



        switch (id){

            case  R.id.ButtonCero:
                return 0;

            case  R.id.ButtonUno:
                return 1;

            case  R.id.ButtonDos:
                return 2;

            case  R.id.ButtonTres:
                return 3;

            case  R.id.ButtonCuatro:
                return 4;

            case  R.id.ButtonCinco:
                return 5;

            case  R.id.ButtonSeis:
                return 6;

            case  R.id.ButtonSiete:
                return 7;

            case  R.id.ButtonOcho:
                return 8;

            case  R.id.ButtonNueve:
                return 9;
        }
        return 0;
    }

    /**
     * Método que recibe como parámetro el ID del digito seleccionado
     * El valor recibido por el parametro es asignado a la variable de clase "id".
     */
    @Override
    public void setId(int id){
        this.id = id;
    }

}

