public class Bola {
double jariJari;

public Bola (double jJ) {
    jariJari = jJ;
}

public double hitungLuasPermukaan () {
    double lp = Math.pow (jariJari, 2) * 4 * 3.14;
    return lp;
}

public double hitungVolume () {
    double volume = Math.pow(jariJari, 2) * 4 / 3 * 3.14;
    return volume;
    }
}

   