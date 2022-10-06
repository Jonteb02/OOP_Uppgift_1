package Uppgift_01;

public class Palm extends Plants {
    private final String typeOfLiquid = TypeOfLiquid.KRANVATTEN.getString();
    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
        setAmountOfLiquid();
    }

    // polymorfism
    @Override
    public void setAmountOfLiquid() {
        double baseLevel = 0.5;
        amountOfLiquid = baseLevel * getHeightInMeters();
    }
    @Override
    public String howMuchLiquid() {
        return getName() + " behöver " + getAmountOfLiquid() + "l " + typeOfLiquid;
    }

}
