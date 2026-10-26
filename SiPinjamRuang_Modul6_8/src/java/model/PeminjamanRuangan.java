package model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Model permintaan peminjaman. Atribut private diakses melalui getter/setter
 * yang memvalidasi nilai agar objek konsisten.
 */
public class PeminjamanRuangan {
    private int idMahasiswa;
    private String idRuangan;
    private String keperluan;
    private String butuhKomputer;
    private LocalDate tanggal;
    private LocalTime jamMulai;
    private LocalTime jamSelesai;
    private String status;

    public PeminjamanRuangan(int idMahasiswa, String idRuangan, String keperluan,
            String butuhKomputer, LocalDate tanggal, LocalTime jamMulai,
            LocalTime jamSelesai) {
        setIdMahasiswa(idMahasiswa);
        setIdRuangan(idRuangan);
        setKeperluan(keperluan);
        setButuhKomputer(butuhKomputer);
        setTanggal(tanggal);
        setJamMulai(jamMulai);
        setJamSelesai(jamSelesai);
        setStatus("Pending");
    }

    public int getIdMahasiswa() { return idMahasiswa; }
    public void setIdMahasiswa(int idMahasiswa) {
        if (idMahasiswa <= 0) throw new IllegalArgumentException("Mahasiswa yang mengajukan tidak valid.");
        this.idMahasiswa = idMahasiswa;
    }

    public String getIdRuangan() { return idRuangan; }
    public void setIdRuangan(String idRuangan) {
        if (idRuangan == null || idRuangan.isBlank()) throw new IllegalArgumentException("Ruangan wajib dipilih.");
        String nilai = idRuangan.trim();
        if (nilai.length() > 30) throw new IllegalArgumentException("Kode ruangan terlalu panjang.");
        this.idRuangan = nilai;
    }

    public String getKeperluan() { return keperluan; }
    public void setKeperluan(String keperluan) {
        if (keperluan == null || keperluan.isBlank()) throw new IllegalArgumentException("Nama kegiatan/keperluan wajib diisi.");
        String nilai = keperluan.trim();
        if (nilai.length() > 255) throw new IllegalArgumentException("Keperluan maksimal 255 karakter.");
        this.keperluan = nilai;
    }

    public String getButuhKomputer() { return butuhKomputer; }
    public void setButuhKomputer(String butuhKomputer) {
        if (butuhKomputer == null || butuhKomputer.isBlank()) { this.butuhKomputer = "Tidak"; return; }
        String nilai = butuhKomputer.trim();
        if ("ya".equalsIgnoreCase(nilai)) this.butuhKomputer = "Ya";
        else if ("tidak".equalsIgnoreCase(nilai)) this.butuhKomputer = "Tidak";
        else throw new IllegalArgumentException("Pilihan kebutuhan komputer hanya Ya atau Tidak.");
    }

    public LocalDate getTanggal() { return tanggal; }
    public void setTanggal(LocalDate tanggal) {
        if (tanggal == null) throw new IllegalArgumentException("Tanggal peminjaman wajib diisi.");
        this.tanggal = tanggal;
    }

    public LocalTime getJamMulai() { return jamMulai; }
    public void setJamMulai(LocalTime jamMulai) {
        if (jamMulai == null) throw new IllegalArgumentException("Jam mulai wajib diisi.");
        if (jamSelesai != null && !jamSelesai.isAfter(jamMulai)) throw new IllegalArgumentException("Jam selesai harus setelah jam mulai.");
        this.jamMulai = jamMulai;
    }

    public LocalTime getJamSelesai() { return jamSelesai; }
    public void setJamSelesai(LocalTime jamSelesai) {
        if (jamSelesai == null) throw new IllegalArgumentException("Jam selesai wajib diisi.");
        if (jamMulai == null || !jamSelesai.isAfter(jamMulai)) throw new IllegalArgumentException("Jam selesai harus setelah jam mulai.");
        this.jamSelesai = jamSelesai;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        if (status == null || status.isBlank()) throw new IllegalArgumentException("Status peminjaman wajib diisi.");
        String nilai = status.trim();
        if ("pending".equalsIgnoreCase(nilai)) this.status = "Pending";
        else if ("approved".equalsIgnoreCase(nilai)) this.status = "Approved";
        else if ("rejected".equalsIgnoreCase(nilai)) this.status = "Rejected";
        else throw new IllegalArgumentException("Status hanya Pending, Approved, atau Rejected.");
    }
}
