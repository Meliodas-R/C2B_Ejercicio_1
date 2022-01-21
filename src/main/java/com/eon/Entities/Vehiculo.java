package com.eon.Entities;

import javax.swing.JOptionPane;

public class Vehiculo {
 
    private String matricula;
    private double cargaMaxima;
    private double cargaActual;
    private int numCajas = 0;

    public Vehiculo() {
        super();
    }

    public Vehiculo(String matricula) {
        super();
        this.matricula = matricula;
        this.cargaMaxima = 3000.0;
    }

    public Vehiculo(String matricula, double cargaMaxima) {
        super();
        this.matricula = matricula;
        this.cargaMaxima = cargaMaxima;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public int getNumCajas() {
        return numCajas;
    }

    public void setNumCajas(int numCajas) {
        this.numCajas = numCajas;
    }

    /**
     * Añade una caja al camión.
     *
     * @param caja Caja a cargar en el camión.
     */
    public void cargarCaja(Caja caja) {

        if (cargaActual + caja.getPeso() <= cargaMaxima) {
            numCajas = numCajas + 1;
            cargaActual = cargaActual + caja.getPeso();
            JOptionPane.showMessageDialog(null, "Caja cargada");

        } else {
            JOptionPane.showMessageDialog(null, "La caja no se pudo cargar. Peso excedido");
        }
    }

    public void descargarCaja(Caja caja) {

        if (numCajas == 0) {
            System.out.print("No quedan cajas que descargar.");
        } else {
            numCajas = numCajas + 1;
            cargaActual = cargaActual + caja.getPeso();
        }
    }
}
