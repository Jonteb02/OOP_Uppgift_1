package Uppgift_01;

public class CarnivorousPlant extends Plants {
    private final String typeOfLiquid = TypeOfLiquid.PROTEINDRYCK.getString();
    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
        setAmountOfLiquid();
    }

    // polymorfism
    @Override
    public void setAmountOfLiquid() {
        double baseLevel = 0.1;
        double extraSupplement = 0.2;
        amountOfLiquid = baseLevel + (extraSupplement * getHeightInMeters());
    }
    @Override
    public String howMuchLiquid() {
        return getName() + " behöver " + getAmountOfLiquid() + "l " + typeOfLiquid;
    }

}
