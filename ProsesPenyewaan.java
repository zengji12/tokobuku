public class ProsesPenyewaan {
    public static int biayaSewa(Buku buku, int jumlahHari) {
        int total = buku.getHargaSewaPerHari() * jumlahHari;
        return total;
    }
}
