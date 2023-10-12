import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pendapatan, pengeluaran, sisaAnggaran;

        // Input pendapatan bulanan
        System.out.print("Masukkan pendapatan bulanan: $");
        pendapatan = input.nextDouble();

        // Input pengeluaran bulanan
        System.out.print("Masukkan pengeluaran bulanan: $");
        pengeluaran = input.nextDouble();

        // Menghitung sisa anggaran
        sisaAnggaran = pendapatan - pengeluaran;

        // Menampilkan laporan anggaran
        System.out.println("\nLaporan Anggaran Perpustakaan Bulanan");
        System.out.println("-------------------------------------");
        System.out.println("Pendapatan Bulanan: Rp." + pendapatan);
        System.out.println("Pengeluaran Bulanan: Rp." + pengeluaran);
        System.out.println("Sisa Anggaran Bulanan: Rp." + sisaAnggaran);

        // Menentukan status anggaran dengan DO-WHILE loop
        do {
            if (sisaAnggaran > 0) {
                System.out.println("Anggaran perpustakaan memiliki sisa.");
                if (sisaAnggaran > pendapatan * 0.2) {
                    System.out.println("Sisa anggaran lebih dari 20% pendapatan. Anda dapat mengalokasikan lebih banyak untuk pengeluaran.");
                }
            } else if (sisaAnggaran < 0) {
                System.out.println("Anggaran perpustakaan mengalami defisit.");
                if (sisaAnggaran < pengeluaran * -0.2) {
                    System.out.println("Defisit anggaran lebih dari 20% pengeluaran. Perhatikan pengeluaran Anda.");
                }
            } else {
                System.out.println("Anggaran perpustakaan seimbang.");
            }

            // Melanjutkan atau keluar dari DO-WHILE loop berdasarkan input pengguna
            System.out.print("Apakah Anda ingin memeriksa status anggaran lagi? (Ya/Tidak): ");
            String jawaban = input.next();
            if (!jawaban.equalsIgnoreCase("Ya")) {
                break; // Keluar dari loop jika jawaban bukan "Ya"
            }

            // Input ulang pengeluaran bulanan jika diperlukan
            System.out.print("Masukkan pengeluaran bulanan baru: $");
            pengeluaran = input.nextDouble();

            // Menghitung sisa anggaran berdasarkan pengeluaran baru
            sisaAnggaran = pendapatan - pengeluaran;

        } while (true);
    }
}