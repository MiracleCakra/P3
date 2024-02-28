package Latihan3;

import java.util.Scanner;

public class InformasiMainModif {

    public static void main(String[] args) {
        Scanner cakra = new Scanner(System.in);
        Scanner cakra1 = new Scanner(System.in);
        Scanner cakra2 = new Scanner(System.in);

        InformasiModif[] mahasiswa = new InformasiModif[3]; // Assuming the array size is 3

        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new InformasiModif();
            System.out.println("Masukkan data mahasiswa ke - " + (i + 1));
            System.out.print("Masukkan nama           : ");
            mahasiswa[i].nama = cakra.nextLine();
            System.out.print("Masukkan NIM            : ");
            mahasiswa[i].nim = cakra1.nextInt();
            //sc.nextLine(); // Consume the newline character
            System.out.print("Masukkan Jenis Kelamin  : ");
            mahasiswa[i].jenisKelamin = cakra.nextLine();
            System.out.print("Masukkan IPK            : ");
            mahasiswa[i].ipk = cakra2.nextDouble();
            System.out.println();
            //sc.nextLine(); // Consume the newline character
        }

        double rataRata = 0;
        double ipkTertinggi = 0;
        int datamahasiswaTertinggi = 0;

        for (int i = 0; i < mahasiswa.length; i++) {
            rataRata += mahasiswa[i].ipk;
            if (mahasiswa[i].ipk > ipkTertinggi) {
                ipkTertinggi = mahasiswa[i].ipk;
                datamahasiswaTertinggi = i;
            }
        }
        rataRata /= mahasiswa.length;

        System.out.println("==============================================================");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke - " + (i + 1));
            System.out.println("Nama           : " + mahasiswa[i].nama);
            System.out.println("NIM            : " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin  : " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK            : " + mahasiswa[i].ipk);
            System.out.println();
        }
        System.out.println("==============================================================");

        System.out.println();
        System.out.println("Rata-rata IPK: " + rataRata);
        System.out.println("Data mahasiswa dengan IPK tertinggi: " + ipkTertinggi);
        System.out.println("Data mahasiswa:");
        System.out.println("Nama           : " + mahasiswa[datamahasiswaTertinggi].nama);
        System.out.println("NIM            : " + mahasiswa[datamahasiswaTertinggi].nim);
        System.out.println("Jenis Kelamin  : " + mahasiswa[datamahasiswaTertinggi].jenisKelamin);
        System.out.println("IPK            : " + mahasiswa[datamahasiswaTertinggi].ipk);

        cakra.close();
        cakra1.close();
        cakra2.close();
    }
}