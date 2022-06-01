import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestVanAlles {

    @Test
    void TrueCheckCessnaVliegtuig () {
        CessnaVliegtuig cessnaVliegtuig = new CessnaVliegtuig(1000,50.00,true);
        assertTrue(cessnaVliegtuig.CheckCessnaVliegtuig(1050,60.00,true));
        assertTrue(cessnaVliegtuig.CheckCessnaVliegtuig(500,80.00,true));
        assertFalse(cessnaVliegtuig.CheckCessnaVliegtuig(1050,40.00,true));
    }

    @Test
    void getPrijsMetGewicht() {

        double gewicht999 = 999;
        double gewicht4500 = 4500;
        double gewicht5001= 5001;

        assertEquals(100.00, new PrijsMetGewicht(gewicht999).GetPrijsMetGewicht());
        assertEquals(500.00, new PrijsMetGewicht(gewicht4500).GetPrijsMetGewicht());
        assertEquals(2500.00, new PrijsMetGewicht(gewicht5001).GetPrijsMetGewicht());

    }

    @Test
    void getTotaalPrijsMetHonderdAlsBasisprijs() {

        assertEquals(900, TotalePrijs.getTotaalPrijs(1,true,false));

    }

    @Test
    void getTotaalPrijsMetAlsVijfhonderdAlsBasisprijs() {

        assertEquals(181.5, TotalePrijs.getTotaalPrijs(3,false,true));
    }

    @Test
    void getTotaalPrijsMetAlsTweeDuizendVijfHonderdAlsBasisprijs() {

        assertEquals(1089.0, TotalePrijs.getTotaalPrijs(1,true,true));
    }
}
