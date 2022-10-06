package Uppgift_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    Cactus c = new Cactus("Igge", 1);
    @Test
    void testSetAmountOfLiquid() {
        assert (c.getAmountOfLiquid() == 2);
        assert (c.getAmountOfLiquid() != 1.5);
    }

    @Test
    void testHowMuchLiquid() {
        assert (c.howMuchLiquid().equals("Igge behöver 2.0cl mineralvatten"));
        assert (!c.howMuchLiquid().equals("Igge behöver 2cl kranvatten"));
    }
}