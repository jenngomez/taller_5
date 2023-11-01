package com.yenifergomez.dominioyg;

public class Vendedor extends Directo{

    private long ventasDelMesYenifer;


    public Vendedor(String nombreYenifer, long salarioYenifer, long ventasDelMesYenifer) {
        super(nombreYenifer, salarioYenifer);
        this.ventasDelMesYenifer=ventasDelMesYenifer;
    }

    public long calcularComisionGomez(){
        long valorComision=0;

        if(getSalarioYenifer()<999999){
            valorComision=(long)((ventasDelMesYenifer*0.04)*getSalarioYenifer());
        } else if (getSalarioYenifer()>1000000) {
            valorComision=(long)((ventasDelMesYenifer*0.35)*getSalarioYenifer());
        }
        return valorComision;
    }
}
