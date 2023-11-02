package com.yenifergomez.dominioyg;

import java.util.ArrayList;

public class Nomina {
    private  ArrayList<Empleado> empleadosYenifer;

    public Nomina(ArrayList<Empleado> empleadosYenifer) {
        this.empleadosYenifer = empleadosYenifer;
    }

    public void calcularNominaGomez(){
        for (Empleado empleado : empleadosYenifer) {
            double salarioTotal = 0.0;

            if (empleado instanceof Directo) {
                salarioTotal = ((Directo) empleado).calcularSalarioGomez();
            } else if (empleado instanceof Freelance) {
                salarioTotal = ((Freelance) empleado).calcularSalarioGomez();
            } else if (empleado instanceof Promotor) {
                salarioTotal = ((Promotor) empleado).calcularSalarioGomez();
            }else if (empleado instanceof Vendedor) {
                salarioTotal = ((Vendedor) empleado).calcularSalarioGomez();
            }
            System.out.println(empleado.getNombreYenifer() + ": " + salarioTotal);
        }

    }
    public void listarDirectosGomez(){
        for (Empleado empleado : empleadosYenifer){
            if (empleado instanceof Directo){
                System.out.println(empleado.getNombreYenifer() + " : Directo");
            }
        }
    }
    public void listarFreelanceGomez(){
        for (Empleado empleado : empleadosYenifer){
            if (empleado instanceof Freelance){
                System.out.println(empleado.getNombreYenifer() + " : Freelance");
            }
        }

    }
    public void listarPromotoresGomez(){
        for (Empleado empleado : empleadosYenifer){
            if (empleado instanceof Promotor){
                System.out.println(empleado.getNombreYenifer() + " : Promotor");
            }
        }

    }

    public ArrayList<Empleado> getEmpleadosYenifer() {
        return empleadosYenifer;
    }

    public void setEmpleadosYenifer(ArrayList<Empleado> empleadosYenifer) {
        this.empleadosYenifer = empleadosYenifer;
    }
}
