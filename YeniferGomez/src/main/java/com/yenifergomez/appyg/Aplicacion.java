package com.yenifergomez.appyg;

import com.yenifergomez.dominioyg.*;

import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {
        Directo juan = new Directo("Juan", 4840000);
        Vendedor julian = new Vendedor("Julián", 2050000,45510000);
        Freelance johanna = new Freelance("Johanna", 71000,89);
        Vendedor carolina = new Vendedor("Carolina", 980000,35989000);
        Promotor pedro = new Promotor("Pedro", 1200,300,65);
        Directo david = new Directo("David", 3975000);
        Freelance gustavo = new Freelance("Gustavo", 42500,65);

        ArrayList<Empleado> empleadosYenifer = new ArrayList<>();
        Nomina nomina = new Nomina(empleadosYenifer);

        nomina.getEmpleadosYenifer().add(juan);
        nomina.getEmpleadosYenifer().add(julian);
        nomina.getEmpleadosYenifer().add(johanna);
        nomina.getEmpleadosYenifer().add(carolina);
        nomina.getEmpleadosYenifer().add(pedro);
        nomina.getEmpleadosYenifer().add(david);
        nomina.getEmpleadosYenifer().add(gustavo);

        nomina.calcularNominaGomez();

        System.out.println("Nombre empleado\tSalario\tTipo empleado");
        for (Empleado empleado : nomina.getEmpleadosYenifer()) {
            String tipoEmpleado = "";
            if (empleado instanceof Vendedor) {
                tipoEmpleado = " - Vendedor";
            } else if (empleado instanceof Freelance) {
                tipoEmpleado = " - Freelance";
            } else if (empleado instanceof Promotor) {
                tipoEmpleado = " - Promotor";
            } else if (empleado instanceof Directo) {
                tipoEmpleado = " - Directo";
            }

            System.out.println(empleado.getNombreYenifer() + "\t\t" + "$" + empleado.calcularSalarioGomez() + "\t" + tipoEmpleado);
        }


    }
}
