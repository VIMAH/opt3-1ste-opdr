public class CessnaVliegtuig {

    public static double MaximaalGewicht;
    private Boolean Toestemmingtoren;
    private double Snelheid;


    public CessnaVliegtuig(double MaximaalGewicht, double Snelheid, Boolean Toestemmingtoren) {
        this.MaximaalGewicht = MaximaalGewicht;
        this.Snelheid = Snelheid;
        this.Toestemmingtoren = Toestemmingtoren;
    }

    public boolean CheckCessnaVliegtuig(double Gewicht, double Snelheid, Boolean Toestemmingtoren) {
        return Toestemmingtoren && Gewicht < 1000 || Snelheid > 50;
    }
}