package Uppgift_01;

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
    public String howMuchLiquid() {
        return getName() + " behöver " + getAmountOfLiquid() + "l " + typeOfLiquid;
    }

}
