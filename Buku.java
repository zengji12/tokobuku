public class Buku {
    protected String jenis;
    protected int hargaSewaPerHari;

    public Buku(String jenis, int hargaSewaPerHari) {
        this.jenis = jenis;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public String getJenis(){
        return jenis;
    }

    public int getHargaSewaPerHari(){
        return hargaSewaPerHari;
    }
}