import java.util.Scanner;

public class BangunRuang {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Kerucut[] kerucut = new Kerucut[2];
    Limas[] limas = new Limas[2];
    Bola[] bola = new Bola[2];

    for (int i = 0; i < kerucut.length; i++) {
      System.out.print("Masukkan Jari-jari Kerucut: ");
      double jjKerucut = sc.nextDouble();
      System.out.print("Masukkan sisi Miring : ");
      double smKerucut = sc.nextDouble();
      System.out.print("----------------------------------------------\n");
      kerucut[i] = new Kerucut(jjKerucut, smKerucut);
      System.out.print("Luas Permukaan Pada Kerucut ke - " + i + ": " + kerucut[i].hitungLuas() + "\n");
      System.out.print("Volume Pada Kerucut ke - " + i + ": " + kerucut[i].hitungVolume() + "\n");
      System.out.print("----------------------------------------------\n");
      System.out.println();
    }

    for (int i = 0; i < limas.length; i++) {
      System.out.print("Masukkan panjang sisi Alas Limas: ");
      double pslLimas = sc.nextDouble();
      System.out.print("Masukkan tinggi Limas: ");
      double tLimas = sc.nextDouble();
      System.out.print("----------------------------------------------\n");
      limas[i] = new Limas(pslLimas, tLimas);
      System.out.print("Luas Permukaan Pada Limas ke -" + i + ": " + limas[i].hitungLuas() + "\n");
      System.out.print("Volume Pada Limas ke -" + i + ": " + limas[i].hitungVolume() + "\n");
      System.out.print("----------------------------------------------\n");
      System.out.println();
    }

    for (int i = 0; i < bola.length; i++) {
      System.out.print("Masukkan jari-jari bola: ");
      double jjBola = sc.nextDouble();
      System.out.print("----------------------------------------------\n");
      bola[i] = new Bola(jjBola);
      System.out.print("Luas Permukaan Pada bola ke -" + i + ": " + bola[i].hitungLuasPermukaan() + "\n");
      System.out.print("Volume Pada bola ke -" + i + ": " + bola[i].hitungVolume() + "\n");
      System.out.print("----------------------------------------------\n");
      System.out.println();
    }
  }
}