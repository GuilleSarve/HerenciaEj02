package Herencias;

import java.util.Scanner;

public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected char consumoE;
    protected Integer peso;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {

    }

    public Electrodomestico(Integer pecio, String color, char consumoE, Integer peso) {
        this.precio = pecio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoE);
        comprobarColor(this.color);
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "pecio=" + precio + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso + '}';
    }

    private void comprobarConsumoEnergetico(char letra) {
        switch (Character.toUpperCase(letra)) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                break;
            default:
                this.consumoE = 'F';
        }
    }

    private void comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "blanco":
            case "negro":
            case "rojo": 
            case "azul":
            case "gris":  
                break;
            default:
                this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        this.setPrecio(1000);
        System.out.println("ingrese el color ");
        this.setColor(leer.next());
        System.out.println("ingrese Consumo energetico");
        this.setConsumoE(leer.next().charAt(0));
        System.out.println("ingrese el peso");
        this.setPeso(leer.nextInt());
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumoE);
    }

    public void precioFinal() {
        switch (consumoE) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
               this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
            case 'E':
                this.setPrecio(this.getPrecio() + 300);//this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
            this.precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            this.precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800;
        } else if (peso >= 80) {
            this.precio += 1000;
        }
    }
}
