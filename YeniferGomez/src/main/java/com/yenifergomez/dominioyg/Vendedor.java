package com.yenifergomez.dominioyg;

public class Vendedor extends Directo{

    private long ventasDelMesYenifer;


    public Vendedor(String nombreYenifer, long salarioYenifer, long ventasDelMesYenifer) {
        super(nombreYenifer, salarioYenifer);
        this.ventasDelMesYenifer=ventasDelMesYenifer;
    }

    @Override
    public long calcularSalarioGomez() {

        return (getSalarioYenifer() + calcularComisionGomez())-(calcularPensionGomez()+calcularSaludGomez());
    }
    public long calcularComisionGomez(){
        long comision =0;

        if (getSalarioYenifer() < 999999) {
            comision = (long) ((ventasDelMesYenifer * 0.04));
        } else if (getSalarioYenifer() > 1000000) {
            comision = (long) ((ventasDelMesYenifer * 0.035));
        }
        return comision;
    }

    public long getVentasDelMesYenifer() {
        return ventasDelMesYenifer;
    }

    public void setVentasDelMesYenifer(long ventasDelMesYenifer) {
        this.ventasDelMesYenifer = ventasDelMesYenifer;
    }
}
