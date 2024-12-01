package ec.edu.espoch.conceptoautomovil.automovil;

import ec.edu.espoch.conceptoautomovil.color.Color;
import ec.edu.espoch.conceptoautomovil.tipoAutomovil.TipoAutomovil;
import ec.edu.espoch.conceptoautomovil.tipoCombustible.TipoCombustible;

public class Automovil {
    
    //ATRIBUTOS//

    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numPuertas;
    private int numAsientos;
    private double velMaxima;
    private Color color;
    private double velActual = 0;
    
    //CONSTRUCTOR//

    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numPuertas, int numAsientos, double velMaxima, Color color, double velActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velMaxima = velMaxima;
        this.color = color;
        this.velActual = velActual;
    }
    
    
    //GET Y SET DE CADA ATRIBUTO//

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelActual() {
        return velActual;
    }

    public void setVelActual(double velActual) {
        this.velActual = velActual;
    }

    // MÉTODOS PARA ACELERAR, DESACELERAR Y FRENAR//
    public void acelerar(int incremento) {
        if (velActual + incremento <= velMaxima) {
            velActual = velActual + incremento;
        } else {
            System.out.println("¡No puedes exceder la velocidad máxima permitida!");
        }
    }

    public void desacelerar(int decremento) {
        if (velActual - decremento >= 0) {
            velActual = velActual - decremento;
        } else {
            System.out.println("¡La velocidad no puede ser negativa!");
        }
    }

    public void frenar() {
        velActual = 0;

    }

    //METODO PARA CALCLULAR EL TIEMPO ESTIMADO DE LLEGADA//
    public double calcularTiempoLlegada(double distancia) {
        if (velActual > 0) {
            return distancia / velActual;
        } else {
            System.out.println("El vehículo está detenido.");
            return -1;
        }
    }

    //MÉTODO PARA MOSTRAR ATRIBUTOS//
    public void mostrarAtributos() {
        System.out.println("Marca del automovil: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " Litros");
        System.out.println("Tipo de combustible : " + tipoCombustible);
        System.out.println("Tipo de automovil: " + tipoAutomovil);
        System.out.println("Numero de puertas: " + numPuertas);
        System.out.println("Cantidad de asientos: " + numAsientos);
        System.out.println("Velocidad Maxima: " + velMaxima+ "Km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velActual+ "Km/h");
    }

}
