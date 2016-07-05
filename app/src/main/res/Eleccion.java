/**
 * Created by abele on 20/06/2016.
 */
public class Eleccion {

    pricate int eleccion;

    public void setEleccion(int eleccion){

        this.eleccion = eleccion;
    }

    public int getEleccion(){

        switch (eleccion){

            case 0:
                eleccion = 0;
                return eleccion;
                break;

            case 1:
                eleccion = 1;
                return eleccion;
                break;

            case 2:
                eleccion = 2;
                return eleccion;
                break;
        }


        return eleccion;
    }

}
