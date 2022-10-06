package Uppgift_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm p = new Palm("Laura", 3);
    @Test
    void testSetAmountOfLiquid() {
        assert (p.getAmountOfLiquid() == 1.5);
        assert (p.getAmountOfLiquid() != 1);
    }

    @Test
    void testHowMuchLiquid() {
        assert (p.howMuchLiquid().equals("Laura behöver 1.5l kranvatten"));
        assert (!p.howMuchLiquid().equals("Meatloaf behöver 1.5l kranvatten"));
    }
}