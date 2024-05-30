import java.util.ArrayList;

import Controlador.CelularController;
import Modelo.Celular;
import Vista.ObjetoView;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, Mundo!");
        ArrayList<Celular> celular1 = new ArrayList<>();
        celular1.add(new Celular("Phone", 7));
        celular1.add(new Celular("Motorola", 8));
        celular1.add(new Celular("Xiomi", 9));
        celular1.add(new Celular("Redmi", 10));
        celular1.add(new Celular("Asus", 11));

        // Buscar un celular en la lista
        Celular encontrado = CelularController.busquedaSecuencial(celular1, "Phone");

        // Verificar si se encontró el objeto y mostrarlo usando ObjectView
        if (encontrado != null) {
            System.out.println("Celular encontrado:");
            ObjetoView.mostrarObjeto(encontrado);
        } else {
            System.out.println("Celular no encontrado.");
        }
    }
}
