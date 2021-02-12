import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();
        Electrodomestico lampara = new Electrodomestico(1, "A", "Nacional");
        Electrodomestico calentador = new Electrodomestico(2, "C", "Importado");
        listaElectrodomesticos.add(lampara);
        listaElectrodomesticos.add(calentador);
        System.out.println("Los Electrodomesticos vendidos tienen las siguientes características " + listaElectrodomesticos);
        double precioFinalElectrodomesticos = 0;
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            System.out.println(electrodomestico.getPrecio());
            precioFinalElectrodomesticos = precioFinalElectrodomesticos + electrodomestico.getPrecio();
        }

        System.out.println("El valor total de los Electrodomesticos es " + precioFinalElectrodomesticos);

        ArrayList<Nevera> listaNeveras = new ArrayList<Nevera>();
        Nevera nev1 = new Nevera(3, "C", "Importado", 150);
        Nevera nev2 = new Nevera(4, "B", "Nacional", 120);
        listaNeveras.add(nev1);
        listaNeveras.add(nev2);
        System.out.println("El valor total de las neveras vendidas es " + listaNeveras);

        double precioFinalNeveras = 0;
        for (Nevera nevera : listaNeveras) {
            System.out.println(nevera.getPrecio());
            precioFinalNeveras = precioFinalNeveras + nevera.getPrecio();
        }
        System.out.println("El valor total de las neveras vendidas es: " + precioFinalNeveras);

        ArrayList<Televisor> listaTelevisores = new ArrayList<Televisor>();
        Televisor telev1 = new Televisor(5, "C", "Importado", 45, true);
        Televisor telev2 = new Televisor(4, "B", "Nacional", 120, false);
        listaTelevisores.add(telev1);
        listaTelevisores.add(telev2);
        System.out.println("Los televisores tienen las siguientes características: " + listaTelevisores);

        double precioFinalTelevisores = 0;
        for (Televisor televisor : listaTelevisores) {
            System.out.println(televisor.getPrecio());
            precioFinalTelevisores = precioFinalTelevisores + televisor.getPrecio();
        }

        System.out.println("El valor total de los televisores vendidos es: " + precioFinalTelevisores);


    }

}