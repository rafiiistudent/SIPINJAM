package model;

/** Akun mahasiswa mewarisi identitas umum dari Pengguna. */
public class Mahasiswa extends Pengguna implements IdentitasLogin {
    private int idMahasiswa;
    private String nim;

    public Mahasiswa(int idMahasiswa, String nim, String nama) {
        super(nama);
        setIdMahasiswa(idMahasiswa);
        setNim(nim);
    }

    public int getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(int idMahasiswa) {
        if (idMahasiswa <= 0) {
            throw new IllegalArgumentException("ID mahasiswa harus lebih besar dari 0.");
        }
        this.idMahasiswa = idMahasiswa;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim == null || nim.isBlank()) {
            throw new IllegalArgumentException("NIM wajib diisi.");
        }
        this.nim = nim.trim();
    }

    @Override
    public String getIdentitasLogin() {
        return nim;
    }

    @Override
    public String getJenisPengguna() {
        return "Mahasiswa";
    }
}
