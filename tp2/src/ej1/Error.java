package ej1;

import java.util.InputMismatchException;

//no me funciono lanzar este excepcion;

public class Error extends InputMismatchException {

    public Error(String mensaje){
        super(mensaje);
    }
}
