package Controlador;

import java.util.ArrayList;

import Modelo.Celular;

public class CelularController {

    public static Celular busquedaSecuencial(ArrayList<Celular> list, String nombreModelo) {
        for (Celular celular : list) {
            if (celular.getModelo().equals(nombreModelo)) {
                return celular;
            }
        }
        return null;
    }
}