package com.yenifergomez.dominioyg;

public class Directo extends Empleado{

    private long salarioYenifer;


    public Directo(String nombreYenifer, long salarioYenifer) {
        super(String.valueOf(nombreYenifer));
        this.salarioYenifer=salarioYenifer;
    }

    public long calcularSaludGomez(){
        return (long) (salarioYenifer*0.05);
    }
    public long calcularPensionGomez(){
        return (long) (salarioYenifer * 0.065);
    }


    @Override
    public long calcularSalarioGomez(){
        return (salarioYenifer-calcularSaludGomez())-calcularPensionGomez();
    }

    public long getSalarioYenifer() {
        return salarioYenifer;
    }

    public void setSalarioYenifer(long salarioYenifer) {
        this.salarioYenifer = salarioYenifer;
    }
}
