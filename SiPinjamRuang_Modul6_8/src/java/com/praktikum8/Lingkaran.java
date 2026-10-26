package com.praktikum8;

public class Lingkaran extends BangunDatar {
    private final double jariJari;

    public Lingkaran(String warna, double jariJari) {
        super(warna);
        if (!Double.isFinite(jariJari) || jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus berupa angka positif.");
        }
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
