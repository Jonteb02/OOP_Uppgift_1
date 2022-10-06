package Uppgift_01;

abstract class Plants implements Watered {
    private final String name;
    private final double heightInMeters;
    protected double amountOfLiquid;

    public Plants(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    //Inkapsling
    public String getName() {
        return name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    @Override
    public Double getAmountOfLiquid() {
        return amountOfLiquid;
    }
}
