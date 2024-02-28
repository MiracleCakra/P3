package Latihan2;

import java.util.Scanner;

public class InformasiMain {

public static void main(String[] args) {
        Scanner cakra = new Scanner(System.in);
        Scanner cakra1 = new Scanner(System.in);
        Scanner cakra2 = new Scanner(System.in);

        Informasi [] mahasiswa = new Informasi[3]; 

        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new Informasi();
            System.out.println("Masukkan data mahasiswa ke - " + (i + 1));
            System.out.print("Masukkan nama          : ");
            mahasiswa[i].nama = cakra1.nextLine();
            System.out.print("Masukkan NIM           : ");
            mahasiswa[i].nim = cakra2.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            mahasiswa[i].jenisKelamin = cakra1.nextLine();
            System.out.print("Masukkan IPK           : ");
            mahasiswa[i].ipk = cakra.nextDouble();
            System.out.println();
        }
            
        System.out.println("==============================================================");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke - " + (i + 1));
            System.out.println("Nama          : " + mahasiswa[i].nama);
            System.out.println("NIM           : " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin : " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK           : " + mahasiswa[i].ipk);
            System.out.println();
        }
        System.out.println("==============================================================");
        cakra.close();
        cakra1.close();
        cakra2.close();
    }
}
