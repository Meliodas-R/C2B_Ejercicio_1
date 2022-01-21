package com.eon.PL;

import com.eon.Entities.Caja;
import com.eon.Entities.Vehiculo;

public class Principal {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        Vehiculo furgo = new Vehiculo("1234-ASD", 1000.0);

        vehiculo.setCargaMaxima(200);

        System.out.printf("El camion tiene una capacidad de %f kg de carga", vehiculo.getCargaMaxima());

        vehiculo.cargarCaja(new Caja());
        vehiculo.cargarCaja(new Caja());
        vehiculo.cargarCaja(new Caja());

        System.out.printf("%nEl vehiculo tiene una carga actual de %f kg y %d cajas", vehiculo.getCargaActual(), vehiculo.getNumCajas());

        System.out.print("Tu matricula es: " + furgo.getMatricula());
    }

}
