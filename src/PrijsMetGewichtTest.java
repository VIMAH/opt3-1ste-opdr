import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrijsMetGewichtTest {

    @Test
    void getPrijsMetGewicht() {

        double gewicht999 = 999;
        double gewicht4500 = 4500;
        double gewicht5001= 5001;

        assertEquals(100.00, new PrijsMetGewicht(gewicht999).GetPrijsMetGewicht());
        assertEquals(500.00, new PrijsMetGewicht(gewicht4500).GetPrijsMetGewicht());
        assertEquals(2500.00, new PrijsMetGewicht(gewicht5001).GetPrijsMetGewicht());

    }
}