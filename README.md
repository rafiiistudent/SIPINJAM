# SIPINJAM / SiPinjamRuang - Praktikum PBO

Aplikasi konsep peminjaman ruangan kampus dan latihan Pemrograman Berorientasi Objek (PBO). Branch ini menambahkan bahan implementasi Modul 6 dan Modul 8 di folder SiPinjamRuang_Modul6_8.

## Materi PBO yang diterapkan

### Modul 6
- Enkapsulasi melalui atribut private dan akses terkontrol lewat getter/setter.
- Validasi ID, NIM, ruangan, keperluan, tanggal, jam, dan status peminjaman.
- Inheritance: Admin dan Mahasiswa mewarisi Pengguna.
- Keyword super pada konstruktor kelas turunan.
- Abstract class Pengguna dan overriding getJenisPengguna().

### Modul 8
- Runtime polymorphism / method overriding melalui Hewan, Kucing, dan Anjing.
- Abstract class BangunDatar dan abstract method hitungLuas(), diimplementasikan oleh Lingkaran.
- Multiple interface implementation: Smartphone implements AlatElektronik dan Kamera.
- Pemakaian interface identitas dan peran pada model akun SiPinjamRuang.

## Menjalankan demonstrasi Modul 8

1. Buka folder source modul di NetBeans.
2. Jalankan PoliTester.java menggunakan Run File.
3. Output mencakup overriding, luas lingkaran, dua interface, dan polimorfisme Admin/Mahasiswa.

## Aplikasi web SiPinjamRuang

Source lengkap aplikasi web (JSP/Servlet, konfigurasi NetBeans, serta library MySQL Connector/J) tersedia sebagai paket ZIP yang disertakan pada percakapan. Untuk menjalankannya, buka folder proyek web di NetBeans, sesuaikan URL database lokal pada Koneksi.java, lalu Clean and Build dan Run.

## Database dan privasi

Jangan commit ekspor SQL yang berisi NIM/nama mahasiswa, password, atau transaksi nyata. Siapkan database lokal dari SQL yang memang diizinkan untuk dibagikan. Jangan jalankan generator dummy berulang kali jika tidak ingin menggandakan transaksi.

## Catatan

Proyek ini ditujukan untuk praktikum dan pengembangan lokal. Sebelum dipakai di produksi, pindahkan kredensial dari kode, gunakan password hashing, dan terapkan validasi otorisasi di sisi server.
