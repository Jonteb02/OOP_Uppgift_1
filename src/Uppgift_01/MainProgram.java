package Uppgift_01;

import javax.swing.*;

public class MainProgram {


    public static void main(String[] args) {
        new MainProgram();
    }

    MainProgram() {
        String extractedName = extractFlower();
        while (!extractedName.equalsIgnoreCase("quit")) {
            printOutAmountOfWaterFrom(extractedName);
            extractedName = extractFlower();
        }
    }
    private static void printOutAmountOfWaterFrom(String name) {
        // Polymorfism
        Plants Igge = new Cactus("Igge", 0.20);
        Plants Meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Plants laura = new Palm("Laura", 5);
        Plants putte = new Palm("Putte", 1);
        if (name.equalsIgnoreCase(Igge.getName())) {
            Igge.howMuchLiquid();
        } else if (name.equalsIgnoreCase(laura.getName())) {
            laura.howMuchLiquid();
        } else if (name.equalsIgnoreCase(putte.getName())) {
            putte.howMuchLiquid();
        } else if (name.equalsIgnoreCase(Meatloaf.getName())) {
            Meatloaf.howMuchLiquid();
        } else {
            JOptionPane.showMessageDialog(null, "Du har ingen växt med det namnet");
        }
    }

    private static String extractFlower() {
        try {
            String name = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (name.length() > 0 && !name.isBlank()) {
                return name;
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Programmet avslutades");
            return "quit";
        }
        return "";
    }
}
