package Uppgift_01;

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
    public String howMuchLiquid() {
        return getName() + " behöver " + getAmountOfLiquid() + "cl " + typeOfLiquid;
    }
}
