import java.util.Scanner;
/**
 * HargaBayar27
 */
public class HargaBayar27 {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);

    int harga, jumlah, halamanBuku;
    double dis, total, bayar, jmlDis;
    String merkBuku;

    System.out.println("Masukan harga barang yang dibeli");
    harga=input.nextInt();
    System.out.println("Masukan merk buku yang dibeli");
    merkBuku=input.next();
    System.out.println("Masukan jumlah halaman buku");
    halamanBuku=input.nextInt();
    System.out.println("Masukan Jumlah jumlah barang yang dibeli");
    jumlah=input.nextInt();
    System.out.println("Masukan besaran diskon");
    dis=input.nextDouble();

total=harga*jumlah;
jmlDis=total*dis;
bayar=total*jmlDis;

    System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah " +bayar);
}
}