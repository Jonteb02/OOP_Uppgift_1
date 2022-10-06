package Uppgift_01;

import javax.swing.*;

public class CarnivorousPlant extends Plants {
    private final double baseLevel = 0.1;
    private final double extraSupplement = 0.2;
    private final String typeOfLiquid = TypeOfLiquid.PROTEINDRYCK.getString();
    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
        setAmountOfLiquid();
    }

    @Override
    public void setAmountOfLiquid() {
        amountOfLiquid = baseLevel + (extraSupplement * getHeightInMeters());
    }
    @Override
    public void howMuchLiquid() {
        JOptionPane.showMessageDialog(null,getName() +
                " behöver " + getAmountOfLiquid() + "l " + typeOfLiquid);
    }

}
