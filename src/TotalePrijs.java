import java.util.ArrayList;

public class TotalePrijs {
    private static int passagiers = 2;
    private static boolean WelOfNietAfhandelen =false;
    private static boolean NederlandsVliegtuig = false;
    private static double BasisPrijs = 100.00;

    public TotalePrijs (int passagiers, boolean WelOfNietAfhandelen, boolean NederlandsVliegtuig, double BasisPrijs) {
        this.passagiers = passagiers;
        this.WelOfNietAfhandelen = WelOfNietAfhandelen;
        this.NederlandsVliegtuig = NederlandsVliegtuig;
        this.BasisPrijs = BasisPrijs;
    }
    public static double getTotaalPrijs (int passagier, boolean Afhandelen, boolean NLVliegtuig) {

        double prijs = BasisPrijs;

        if (passagier > passagiers) {
            prijs = prijs * 1.5;
        }
        if (Afhandelen) {
            prijs = prijs + 800;
        }
        if (NLVliegtuig) {
            prijs = prijs * 1.21;
        }
        return prijs;
    }
}