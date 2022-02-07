

package herenciaejercicio02;

import Herencias.Electrodomestico;
import Herencias.Lavadora;
import Herencias.Televisor;

/**
 *
 * @author Guille
 */
public class HerenciaEjercicio02 {

   
    public static void main(String[] args) {
    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();
    lavadora.creaLavadora();
    lavadora.precioFinal();
    televisor.crearTelevisor();
    televisor.precioFinal();
    }

}
