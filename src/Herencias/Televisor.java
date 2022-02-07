package Herencias;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Integer pecio, String color, char consumoE, Integer peso) {
        super(pecio, color, consumoE, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
     
        super.crearElectrodomestico();
        System.out.println("que resolucion tiene que tener tu televisor?");
        this.resolucion = leer.nextInt();
        System.out.println("queres que tenga sintonizador TDT?");      
           String confirmacion=leer.next();
        if (confirmacion.equals("si")) {
            sintonizador=true; 
        }else
            sintonizador = false;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion >= 40) {
            this.precio += precio * 30 / 100;
        }
        if (sintonizador) {
            this.precio += 500;
        }
        System.out.println("Su televisor cuesta " + precio);
    }
}

