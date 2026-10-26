package model;

/** Kelas induk untuk seluruh jenis pengguna aplikasi. */
public abstract class Pengguna implements MemilikiPeran {
    private String nama;

    protected Pengguna(String nama) {
        setNama(nama);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama pengguna wajib diisi.");
        }
        this.nama = nama.trim();
    }

    @Override
    public abstract String getJenisPengguna();
}
