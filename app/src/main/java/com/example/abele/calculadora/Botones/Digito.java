package com.example.abele.calculadora.Botones;

import com.example.abele.calculadora.R;

/**
 * Clase para manejar el ID del digito seleccionado por el usuario.
 * @author Abel Estrada Cruz
 * @version 1.0
 * @since Calculadora 1.0
 * Created by abele on 20/06/2016.
 */

public class Digito extends Boton{

    private int id;


    /**
     * Método para obtener el número del digito seleccionado.
     * @return Número del digito seleccionado.
     * @since Calculadora 1.0
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
     * Método para establecer el valor de la variable id.
     * @param id Entero que almacena el ID del digito seleccionado.
     * @since Calculadora 1.0
     */
    @Override
    public void setId(int id){
        this.id = id;
    }
}

