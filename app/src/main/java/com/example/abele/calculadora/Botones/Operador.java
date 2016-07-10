package com.example.abele.calculadora.Botones;


import com.example.abele.calculadora.R;

/**
 * Clase que maneja el operador seleccionado por el usuario.
 * Created by abele on 21/06/2016.
 */
public class Operador extends Boton {

    private int id;

    /**
     * Método que recibe y evalua el ID del operador seleccionado.
     * @return Retorna un número entre el 1 y 4 según corresponda con el operador seleccionado.
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
     * Método que recibe como parámetro el ID del operador seleccionado.
     * El valor recibido por el parametro es asignado a la variable de clase "id".
     */
    @Override
    public void setId(int id){

        this.id = id;
    }

}