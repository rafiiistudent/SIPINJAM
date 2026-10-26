package com.praktikum8;

/** Abstract class sebagai kerangka bentuk dua dimensi. */
public abstract class BangunDatar {
    private final String warna;

    protected BangunDatar(String warna) {
        if (warna == null || warna.isBlank()) {
            throw new IllegalArgumentException("Warna wajib diisi.");
        }
        this.warna = warna.trim();
    }

    public String getWarna() {
        return warna;
    }

    public abstract double hitungLuas();

    public void cetakWarna() {
        System.out.println("Warna bangun ini: " + warna);
    }
}
