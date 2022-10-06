package Uppgift_01;

import javax.swing.*;

public class Cactus extends Plants {
    private final double baseLevel = 2;
    private final String typeOfLiquid = TypeOfLiquid.MINERALVATTEN.getString();
    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        setAmountOfLiquid();
    }

    public void setAmountOfLiquid() {
        amountOfLiquid = baseLevel;
    }
    @Override
    public void howMuchLiquid() {
        JOptionPane.showMessageDialog(null,getName() +
                " behöver " + getAmountOfLiquid() + "l " + typeOfLiquid);
    }
}
