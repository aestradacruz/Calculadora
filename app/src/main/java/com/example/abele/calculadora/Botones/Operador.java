package com.example.abele.calculadora.Botones;


import com.example.abele.calculadora.R;

/**
 * Clase para manejar el ID del operador seleccionado por el usuario.
 * @author Abel Estrada Cruz
 * @version 1.0
 * @since Calculadora 1.0
 * Created by abele on 21/06/2016.
 */
public class Operador extends Boton {

    private int id;

    /**
     * Método para obtener el operador seleccionado.
     * @return Número entero entre el 1 y 4 según corresponda con el operador seleccionado.
     * @since Calculadora 1.0
     */
    @Override
    public int getId(){

        switch (id) {

            case R.id.ButtonMenos:
                return 1;

            case R.id.ButtonMas:
                return 2;

            case R.id.ButtonPor:
                return 3;

            case R.id.ButtonDivision:
                return 4;
        }

        return 0;
    }

    /**
     * Método para establecer el valor de la variable id.
     * @param id Entero que almacena el ID del operador seleccionado.
     * @since Calculadora 1.0
     */
    @Override
    public void setId(int id){

        this.id = id;
    }

}