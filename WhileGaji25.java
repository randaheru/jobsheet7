import java.util.Scanner;

public class WhileGaji25 {
   public static void main (String [] args){
    Scanner input05 = new Scanner (System.in);
    
    int jumlahKaryawan, jumlahJamLembur; 
    double gajiLembur= 0, totalGajiLembur = 0;
    String jabatan;

    System.out.print("Masukan jumlah karyawan: ");
    jumlahKaryawan = input05.nextInt();

    int i = 0;

    while (i < jumlahKaryawan) {
      System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
      System.out.println("Masukan jabatan karyawan ke-" + (i+1) + ": ");
      jabatan = input05.next();
      System.out.print("Masukan jumlah jam lembur: ");
      jumlahJamLembur = input05.nextInt();
      i++;

      if (jabatan.equalsIgnoreCase("direktur")) {
         continue;
      } else if (jabatan.equalsIgnoreCase("manager")) {
         continue;
      } else if (jabatan.equalsIgnoreCase("karyawan")) {
         gajiLembur = jumlahJamLembur * 10000;
         totalGajiLembur += gajiLembur;
         System.out.println("Total gaji lembur: " + totalGajiLembur);
      } else {
         System.out.println("Jabatan Invalid");
         i--;
      }

      }
    }
   }