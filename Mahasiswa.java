public class Mahasiswa {
    // Atribut
    private String nama;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("Budi", 21);

        // Menampilkan data mahasiswa
        mhs.tampilkanData();
    }
}
