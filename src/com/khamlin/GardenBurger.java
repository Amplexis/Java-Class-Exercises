package com.khamlin;

public class GardenBurger extends Hamburger {
    private String addition5Name;
    private double addition5Cost;

    private String addition6Name;
    private double addition6Cost;

    public GardenBurger() {
        super("Garden Burger");
    }

    @Override
    public void addItem(String name, double price) {
        if (this.numberOfAdditions <= 3) {
            super.addItem(name, price);
        } else if ( this.numberOfAdditions == 4) {
            addition5Name = name;
            addition5Cost = price;
            numberOfAdditions = 5;
            totalPrice += price;
        } else if (this.numberOfAdditions == 5) {
            addition6Name = name;
            addition6Cost = price;
            numberOfAdditions = 6;
            totalPrice += price;
        } else {
            System.out.println("Max number of items added. You may not add any additional items.");
        }
    }

    @Override
    public void breakdown() {
        if (numberOfAdditions <= 4) {
            super.breakdown();
        } else {
            switch(numberOfAdditions) {
                case 5:
                    System.out.println("5 additional items: " + getAddition1Name() + " - $" + getAddition1Cost());
                    System.out.println(getAddition2Name() + " - $" + getAddition2Cost());
                    System.out.println(getAddition3Name() + " - $" + getAddition3Cost());
                    System.out.println(getAddition4Name() + " - $" + getAddition4Cost());
                    System.out.println(getAddition5Name() + " - $" + getAddition5Cost());
                    break;
                case 6:
                    System.out.println("6 additional items: " + getAddition1Name() + " - $" + getAddition1Cost());
                    System.out.println(getAddition2Name() + " - $" + getAddition2Cost());
                    System.out.println(getAddition3Name() + " - $" + getAddition3Cost());
                    System.out.println(getAddition4Name() + " - $" + getAddition4Cost());
                    System.out.println(getAddition5Name() + " - $" + getAddition5Cost());
                    System.out.println(getAddition6Name() + " - $" + getAddition6Cost());
                    break;
            }
        }
    }

    public String getAddition5Name() {
        return addition5Name;
    }

    public double getAddition5Cost() {
        return addition5Cost;
    }

    public String getAddition6Name() {
        return addition6Name;
    }

    public double getAddition6Cost() {
        return addition6Cost;
    }
}
