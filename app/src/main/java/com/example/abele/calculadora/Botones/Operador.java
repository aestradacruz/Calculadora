package com.example.abele.calculadora.Botones;


import com.example.abele.calculadora.R;

/**
 * Created by abele on 21/06/2016.
 */
public class Operador extends Boton {

    private int id;

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

    @Override
    public void setId(int id){
        this.id = id;
    }

}