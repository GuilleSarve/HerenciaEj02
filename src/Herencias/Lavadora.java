package Herencias;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private Integer carga;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, Integer pecio, String color, char consumoE, Integer peso) {
        super(pecio, color, consumoE, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    public void creaLavadora() {
        super.crearElectrodomestico();
        System.out.println("Cuanta carga tiene la lavadora?");
        this.carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga >= 30) {
            this.precio += 500;
        }
        System.out.println("el precio final de la lavadora es " + precio);
    }
}
