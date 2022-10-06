package Uppgift_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {
     CarnivorousPlant  c = new CarnivorousPlant("Meatloaf", 2);

    @Test
    void testSetAmountOfLiquid() {
        assert (c.getAmountOfLiquid() == 0.5);
        assert (c.getAmountOfLiquid() != 1.5);
    }

    @Test
    void testHowMuchLiquid() {
        assert (c.howMuchLiquid().equals("Meatloaf behöver 0.5l proteindryck"));
        assert (!c.howMuchLiquid().equals("Meatloaf behöver 0.5l kranvatten"));
    }
}