import java.util.Scanner;

public class ipk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sks, totalSKS = 0;
        double nilai, totalNilai = 0, ipk;
        int jumlahMataKuliah;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMataKuliah = input.nextInt();

        for(int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.println("Mata kuliah ke-" + i);
            System.out.print("Masukkan jumlah SKS: ");
            sks = input.nextInt();
            if(sks < 1 || sks > 6) {
                System.out.println("Jumlah SKS tidak valid.");
                continue;
            }
            totalSKS += sks;

            System.out.print("Masukkan nilai: ");
            nilai = input.nextDouble();
            if(nilai < 0 || nilai > 4) {
                System.out.println("Nilai tidak valid.");
                continue;
            }
            totalNilai += nilai * sks;
        }

        if(totalSKS == 0) {
            System.out.println("Tidak ada SKS yang diambil.");
            return;
        }

        ipk = totalNilai / totalSKS;

        System.out.println("Total SKS: " + totalSKS);
        System.out.println("IPK: " + ipk);
    }
}


