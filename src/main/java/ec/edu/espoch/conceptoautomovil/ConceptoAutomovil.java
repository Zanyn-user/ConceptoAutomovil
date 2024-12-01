package ec.edu.espoch.conceptoautomovil;

import ec.edu.espoch.conceptoautomovil.automovil.Automovil;
import ec.edu.espoch.conceptoautomovil.color.Color;
import ec.edu.espoch.conceptoautomovil.tipoAutomovil.TipoAutomovil;
import ec.edu.espoch.conceptoautomovil.tipoCombustible.TipoCombustible;

public class ConceptoAutomovil {

    public static void main(String[] args) {

        Automovil objAutomovil = new Automovil("Toyota", 2024, 2.5, TipoCombustible.GASOLINA, TipoAutomovil.SUV, 5, 5, 200, Color.ROJO,100);
        
        objAutomovil.mostrarAtributos();
        
        objAutomovil.acelerar(20);
        System.out.println("Velocidad Actual: "+objAutomovil.getVelActual()+ "Km/h");
        
        objAutomovil.desacelerar(50);
        System.out.println("Velocidad Actual: "+objAutomovil.getVelActual()+ "Km/h");
    }
}
