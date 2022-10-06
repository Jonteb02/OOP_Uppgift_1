package Uppgift_01;

public enum TypeOfLiquid {
    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN ("mineralvatten");
    private String typeOfLiquid;
    TypeOfLiquid(String s) {
        typeOfLiquid = s;
    }
    String getString(){
        return typeOfLiquid;
    }
}
