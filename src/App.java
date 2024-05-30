import java.util.ArrayList;

import Modelo.Celular;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, World!");
        ArrayList<Celular> celular1 = new ArrayList<>();
        celular1.add(new Celular("Phone", 7));
        celular1.add(new Celular("Phone", 8));
        celular1.add(new Celular("Phone", 9));
        celular1.add(new Celular("Phone", 10));
        celular1.add(new Celular("Phone", 11));

    }
}