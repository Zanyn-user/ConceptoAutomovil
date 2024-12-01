package ec.edu.espoch.conceptoautomovil.automovil;

import ec.edu.espoch.conceptoautomovil.color.Color;
import ec.edu.espoch.conceptoautomovil.tipoAutomovil.TipoAutomovil;
import ec.edu.espoch.conceptoautomovil.tipoCombustible.TipoCombustible;

public class Automovil {

    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numPuertas;
    private int numAsientos;
    private double velMaxima;
    private Color color;
    private double velActual =0;

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
    
    
    
    
    
    
}

