public class Televisor extends Electrodomestico {
    private double tamano;
    private boolean tdt;

    public Televisor(int codigo, String consumo, String procedencia, double tamano, boolean tdt) {
        super(codigo, consumo, procedencia);
        this.tamano = tamano;
        this.tdt = tdt;
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        if (tamano > 40){
            super.precio = super.precio + (super.precio*0.3);
        }
        if (tdt == true){
            super.precio = super.precio+250000;
        }
    }
}