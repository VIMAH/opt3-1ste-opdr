import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalePrijsTest {

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