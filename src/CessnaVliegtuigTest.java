import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CessnaVliegtuigTest {

    @Test
    void TrueCheckCessnaVliegtuig () {
        CessnaVliegtuig cessnaVliegtuig = new CessnaVliegtuig(1000,50.00,true);
        assertTrue(cessnaVliegtuig.CheckCessnaVliegtuig(1050,60.00,true));
        assertTrue(cessnaVliegtuig.CheckCessnaVliegtuig(500,80.00,true));
        assertFalse(cessnaVliegtuig.CheckCessnaVliegtuig(1050,40.00,true));
    }
}