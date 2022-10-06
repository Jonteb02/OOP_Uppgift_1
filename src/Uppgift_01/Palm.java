package Uppgift_01;

public class Palm extends Plants {
    private final String typeOfLiquid = TypeOfLiquid.KRANVATTEN.getString();
    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
        setAmountOfLiquid();
    }

    @Override
    public void setAmountOfLiquid() {
        amountOfLiquid = 0.5 * getHeightInMeters();
    }
    @Override
    public String howMuchLiquid() {
        return getName() + " behöver " + getAmountOfLiquid() + "l " + typeOfLiquid;
    }

}
