package com.yenifergomez.dominioyg;

public class Promotor extends Empleado{

    private int volantesRepartidosYenifer;
    private long valorVolanteYenifer;
    private int comprasVolanteYenifer;

    public Promotor(String nombreYenifer,int volantesRepartidosYenifer, long valorVolanteYenifer, int comprasVolanteYenifer) {
        super(nombreYenifer);
        this.volantesRepartidosYenifer=volantesRepartidosYenifer;
        this.valorVolanteYenifer=valorVolanteYenifer;
        this.comprasVolanteYenifer=comprasVolanteYenifer;
    }

    @Override
    public long calcularSalarioGomez() {
        return (valorVolanteYenifer * volantesRepartidosYenifer) + (comprasVolanteYenifer * 15000);
    }

    public int getVolantesRepartidosYenifer() {
        return volantesRepartidosYenifer;
    }

    public void setVolantesRepartidosYenifer(int volantesRepartidosYenifer) {
        this.volantesRepartidosYenifer = volantesRepartidosYenifer;
    }

    public long getValorVolanteYenifer() {
        return valorVolanteYenifer;
    }

    public void setValorVolanteYenifer(long valorVolanteYenifer) {
        this.valorVolanteYenifer = valorVolanteYenifer;
    }

    public int getComprasVolanteYenifer() {
        return comprasVolanteYenifer;
    }

    public void setComprasVolanteYenifer(int comprasVolanteYenifer) {
        this.comprasVolanteYenifer = comprasVolanteYenifer;
    }
}
