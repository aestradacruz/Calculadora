package com.example.abele.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abele.calculadora.Botones.Digito;
import com.example.abele.calculadora.Botones.Operador;

/**
 * Clase principal que:
 *   1) Muestra el digito seleccionado por el usuario en el TextView.
 *   2) Elimina el ultimo digito que contenga el TextView.
 *   3) Elimina el contenido completo que muestre el TextView .
 *   4) Realiza la operación.
 * @autor Abel Estrada Cruz
 * @version 1.0
 * @since Calculadora 1.0
 */
public class MainActivity extends AppCompatActivity {

    TextView tvPantalla;

    Digito digito;

    Operador operador;

    int idButton;
    int idOperador;
    int primerNumero;   //Variable que almacena el primer número.
    int segundoNumero;  //Variable que almacena el segundo número.
    int resultado;
    int valorOperador;  //Variable que almacena el valor del operador.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPantalla = (TextView) findViewById(R.id.textViewPantalla);
        digito = new Digito();
        operador = new Operador();
    }

    /**
     * Método para mostrar en TextView el digito seleccionado por el usuario.
     * @param view View de números.
     * @since Calculadora 1.0
     */
    public void mostrarDigito(View view){

        idButton = view.getId();

        digito.setId(idButton);

        tvPantalla.setText(tvPantalla.getText() + ""+ digito.getId());
    }

    /**
     * Método para eliminar el contenido del TextView e inicializar las variables primerNumero y segundoNumero a 0.
     * @param view View de ButtonClear.
     * @since Calculadora 1.0
     */
    public void limpiarPantalla(View view){

        primerNumero=0;
        segundoNumero= 0;
        tvPantalla.setText(""+0);
    }


    /**
     * Método para eliminar el último digito del TextView.
     * @param view View de ButtonBorrar.
     * @since Calculadora 1.0
     */
    public void borrarDigito(View view){

        String cadenaInicial = tvPantalla.getText().toString();


        int longitudNumero;

        longitudNumero = cadenaInicial.length();
        longitudNumero--;

        String cadenaFinal="";

        for (int i = 0; i < longitudNumero; i++) {

            cadenaFinal+=cadenaInicial.charAt(i);
        }

        tvPantalla.setText(cadenaFinal);
    }

    /**
     * Método para inicializar las variables primerNumero y valorOperador. El método también limpia los digitos del TextView.
     * @param view Views de ButtonMenos, ButtonMas, ButtonPor o ButtonDivision.
     * @since Calculadora 1.0
     */
    public void setOperador(View view) {

        try {
            primerNumero = Integer.parseInt(tvPantalla.getText().toString());
        } catch (NumberFormatException nfe){
            primerNumero = 0;
        }
        tvPantalla.setText("0");

        idOperador = view.getId();
        operador.setId(idOperador);

        valorOperador = operador.getId();
    }


    /**
     * Método para realizar la operación.
     * @param view View de ButtonIgual.
     * @since Calculadora 1.0
     */
    public void getResultado(View view){

        try {
            segundoNumero = Integer.parseInt(tvPantalla.getText().toString());
        }catch (NumberFormatException nfe){
            segundoNumero = 0;
        }

        if(valorOperador == 1){
            resultado = primerNumero - segundoNumero;
            tvPantalla.setText("" + resultado);

        }else if(valorOperador==2){
            resultado = primerNumero + segundoNumero;
            tvPantalla.setText("" + resultado);

        }else if (valorOperador==3) {
            resultado = primerNumero * segundoNumero;
            tvPantalla.setText("" + resultado);

        } else if(valorOperador == 4){

            if(segundoNumero == 0){
                Toast.makeText(this, "Dividir entre 0 es incorrecto. Prueba de nuevo.", Toast.LENGTH_LONG).show();

            }else{
                resultado = primerNumero / segundoNumero;
                tvPantalla.setText("" + resultado);
            }

        }
    }

}


