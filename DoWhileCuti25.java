import java.util.Scanner;

public class DoWhileCuti25 {
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    
    int jatahCuti, jumlahHari;
    String konfirmasi;

    System.out.print("jatah cuti: ");
    jatahCuti = sc.nextInt();

    do{
        System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
        konfirmasi = sc.next();

        if (konfirmasi.equalsIgnoreCase("y")){
            System.out.print("Jumlah hari: ");
            jumlahHari = sc.nextInt();

            if (jumlahHari<= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
            } 
           } else if (konfirmasi.equalsIgnoreCase("t")) {
              break;
        }
    } while (jatahCuti > 0); 
    sc.close();  
  } 
}