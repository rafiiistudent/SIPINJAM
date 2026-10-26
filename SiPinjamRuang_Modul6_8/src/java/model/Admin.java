package model;

/** Akun admin mewarisi identitas umum dari Pengguna. */
public class Admin extends Pengguna implements IdentitasLogin {
    private String username;

    public Admin(String username) {
        super(username);
        setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String getIdentitasLogin() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username admin wajib diisi.");
        }
        this.username = username.trim();
        super.setNama(this.username);
    }

    @Override
    public String getJenisPengguna() {
        return "Admin";
    }
}
