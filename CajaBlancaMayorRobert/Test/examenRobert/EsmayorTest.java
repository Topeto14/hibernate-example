package examenRobert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EsmayorTest {
    @Test
    void VVX() {
        assertEquals(10,Esmayor.mayor(10,8,7));
    }

    @Test
    void FFV() {
        assertEquals(10,Esmayor.mayor(10,11,7));
    }

    @Test
    void FV() {

        assertEquals(15,Esmayor.mayor(10,11,15));
    }

    @Test
    void VFV() {
        assertEquals(10,Esmayor.mayor(10,11,15));
    }
    void VVFX() {
        assertEquals(11,Esmayor.mayor(10,11,7));
    }
}