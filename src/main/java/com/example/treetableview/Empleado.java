package com.example.treetableview;

public class Empleado {
    private final String nombre;
    private final String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public String getName() {
        return nombre;
    }

    public String getRole() {
        return puesto;
    }
}
