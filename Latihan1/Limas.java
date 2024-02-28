public class Limas {
    double alas, tinggi;

public Limas (double a, double t) {
    alas = a;
    tinggi = t;
}

public double hitungLuas() {
    return (alas * alas) + ( 4 * (alas * tinggi / 2));

}

public double hitungVolume() {
    return alas * tinggi / 3;   
    }
}

