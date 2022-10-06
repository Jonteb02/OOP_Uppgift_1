package Uppgift_01;

public class Cactus extends Plants {
    private final String typeOfLiquid = TypeOfLiquid.MINERALVATTEN.getString();
    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        setAmountOfLiquid();
    }

    // polymorfism
    @Override
    public void setAmountOfLiquid() {
        double baseLevel = 2;
        amountOfLiquid = baseLevel;
    }
    @Override
    public String howMuchLiquid() {
        return getName() + " behöver " + getAmountOfLiquid() + "cl " + typeOfLiquid;
    }
}
