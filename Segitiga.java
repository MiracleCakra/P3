public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return alas * tinggi / 2.0;
    }

    public double hitungKeliling()  {
        return alas + tinggi + Math.hypot(tinggi, alas);
    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke " + i);
            System.out.println("Luas "+ sgArray[i].hitungLuas() + ", Keliling " + sgArray[i].hitungKeliling());
        }
    }
}