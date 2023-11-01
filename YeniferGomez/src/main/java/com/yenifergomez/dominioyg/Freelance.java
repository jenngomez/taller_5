package com.yenifergomez.dominioyg;

public class Freelance extends Empleado {
    private long valorHoraYenifer;
    private int horasTrabajadasYenifer;

    public Freelance(String nombreYenifer, long valorHoraYenifer, int horasTrabajadasYenifer) {
        super(nombreYenifer);
        this.valorHoraYenifer=valorHoraYenifer;
        this.horasTrabajadasYenifer=horasTrabajadasYenifer;
    }

    @Override
    public long calcularSalarioGomez() {
        return valorHoraYenifer * horasTrabajadasYenifer;
    }

    public long getValorHoraYenifer() {
        return valorHoraYenifer;
    }

    public void setValorHoraYenifer(long valorHoraYenifer) {
        this.valorHoraYenifer = valorHoraYenifer;
    }

    public int getHorasTrabajadasYenifer() {
        return horasTrabajadasYenifer;
    }

    public void setHorasTrabajadasYenifer(int horasTrabajadasYenifer) {
        this.horasTrabajadasYenifer = horasTrabajadasYenifer;
    }
}
