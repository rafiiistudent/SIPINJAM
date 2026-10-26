package com.praktikum8;

/** Kelas yang mengimplementasikan dua interface sekaligus. */
public class Smartphone implements AlatElektronik, Kamera {
    private final String merek;

    public Smartphone(String merek) {
        if (merek == null || merek.isBlank()) {
            throw new IllegalArgumentException("Merek smartphone wajib diisi.");
        }
        this.merek = merek.trim();
    }

    @Override
    public void nyalakan() {
        System.out.println(merek + " menyala. Booting OS...");
    }

    @Override
    public void matikan() {
        System.out.println(merek + " dimatikan. Goodbye.");
    }

    @Override
    public void ambilFoto() {
        System.out.println("Cekrek! Foto berhasil disimpan dari " + merek + ".");
    }
}
