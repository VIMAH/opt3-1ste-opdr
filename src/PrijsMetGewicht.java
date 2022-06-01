public class PrijsMetGewicht {

    private static double Gewicht;

    public PrijsMetGewicht(double Gewicht) {
        this.Gewicht = Gewicht;
    }

    public static double GetPrijsMetGewicht() {

        if (Gewicht < 1000) {
            return 100.00;
        } else if (Gewicht < 5000) {
            return 500.00;
        } else {
            return 2500;
        }
    }
}