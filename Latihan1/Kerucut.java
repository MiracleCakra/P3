public class Kerucut {
    double jariJari, sisiMiring;
    
    public Kerucut(double jr, double sisi) {
        jariJari = jr;
        sisiMiring = sisi;
    }

    public double hitungLuas() {
        double Ipkerucut = 3.14 * jariJari * (jariJari + sisiMiring);
        return Ipkerucut;
    }

    public double hitungVolume() {
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));
        double volume = 3.14 * jariJari * jariJari * tinggi / 3;
        return volume;
    }
}