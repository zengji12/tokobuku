import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat Datang di Persewaan Buku");
        System.out.print("Masukkan nama peminjam: ");
        String nama = scan.nextLine();
        Pelanggan pelanggan = new Pelanggan(nama);
        
        System.out.println("Pilih Jenis Buku: ");
        System.out.println("1. Novel\n2. Komik");


        Buku buku;
        int pilih = 0;

        System.out.print("Pilih: ");
        pilih = scan.nextInt();
        if (pilih == 1){
            buku = new Novel("Novel");
        }else if (pilih == 2){
            buku = new Komik("Komik");
        }else{
            System.out.println("Pilihan buku tidak valid");
            scan.close();
            return;
        }

        System.out.print("Lama Peminjaman(hari): ");
        int hari = scan.nextInt();

        int hargaSewa = ProsesPenyewaan.biayaSewa(buku, hari);
        System.out.println("Total harga: " + hargaSewa);

        int uang = 0;
        while(uang < hargaSewa) {
            System.out.print("Masukkan uang: Rp. ");
            uang = scan.nextInt();

            if(uang > hargaSewa){
                System.out.println("Kembalian uang: Rp. " + (uang - hargaSewa));
            }else if(uang == hargaSewa){
                System.out.println("Uang Pas :)\n");
            }else{
                System.out.println("Pembayaran tidak sesuai\n");
            }
        }

        System.out.println("Nota Peminjaman");
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Jenis Buku: " + buku.jenis);
        System.out.println("Lama Peminjaman: " + hari);
        System.out.println("Terima kasih sudah mengunakan jasa kami.");

        scan.close();
    }
}
