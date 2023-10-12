import java.util.Scanner;

public class forkelipatan25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, kelipatan, jumlah = 0 , counter = 0, ratarata;

System.out.print("Masukkan bilangan kelipatan (1-9) : ");
kelipatan = input.nextInt();
for (int i = 1; i <= 50; i++) {
    if (i % kelipatan == 0) {
        total += i;
        counter++;

        
    }

        }

        ratarata = total / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("total rata rata %d dari 1 sampai 50 adalah %d\n", kelipatan, ratarata);

            }
}
