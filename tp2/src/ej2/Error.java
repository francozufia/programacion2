package ej2;

import java.util.InputMismatchException;

public class Error extends InputMismatchException{
    public Error(String s) {
        super(s);
    }
}
