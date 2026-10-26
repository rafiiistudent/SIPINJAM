package com.praktikum8;

import model.Admin;
import model.IdentitasLogin;
import model.Mahasiswa;
import model.Pengguna;

/** Entry point demonstrasi Modul 8 dan polimorfisme model akun SiPinjamRuang. */
public class PoliTester {
    public static void main(String[] args) {
        System.out.println("=== MODUL 8: POLYMORPHISM RUNTIME ===");
        Hewan[] daftarHewan = {new Hewan(), new Kucing(), new Anjing()};
        for (Hewan hewan : daftarHewan) {
            hewan.bersuara();
        }

        System.out.println("\n=== ABSTRACT CLASS ===");
        BangunDatar bentuk = new Lingkaran("Biru", 7.0);
        bentuk.cetakWarna();
        System.out.printf("Luas lingkaran: %.2f%n", bentuk.hitungLuas());

        System.out.println("\n=== MULTIPLE INTERFACE ===");
        Smartphone smartphone = new Smartphone("Samsung");
        AlatElektronik perangkat = smartphone;
        Kamera kamera = smartphone;
        perangkat.nyalakan();
        kamera.ambilFoto();
        perangkat.matikan();

        System.out.println("\n=== POLYMORPHISM PADA MODEL SIPINJAMRUANG ===");
        Pengguna[] akun = {
            new Admin("admin_psdku"),
            new Mahasiswa(1, "L0325001", "Mahasiswa Demo")
        };
        for (Pengguna pengguna : akun) {
            IdentitasLogin identitas = (IdentitasLogin) pengguna;
            System.out.println(pengguna.getJenisPengguna() + " | Nama: "
                    + pengguna.getNama() + " | Identitas login: "
                    + identitas.getIdentitasLogin());
        }
    }
}
