package com.yenifergomez.dominioyg;

public abstract class Empleado {

    private String nombreYenifer;

    public Empleado(String nombreYenifer) {
        this.nombreYenifer = nombreYenifer;
    }

    public abstract long calcularSalarioGomez();

    public String getNombreYenifer() {
        return nombreYenifer;
    }

    public void setNombreYenifer(String nombreYenifer) {
        this.nombreYenifer = nombreYenifer;
    }
}
