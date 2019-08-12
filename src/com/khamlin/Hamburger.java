package com.khamlin;

public class Hamburger {
    // The purpose of the application is to help a fictitious company called Bills Burgers to manage
    // their process of selling hamburgers.
    // Our application will help Bill to select types of burgers, some of the additional items (additions) to
    // be added to the burgers and pricing.
    // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.

    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.

    // Each one of these items gets charged an additional price so you need some way to track how many items got added
    // and to calculate the final price (base burger with all the additions).

    // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
    // Create a Hamburger class to deal with all the above.

    // The constructor should only include the roll type, meat and price, can also include name of burger or you
    // can use a setter.

    // Also create two extra varieties of Hamburgers (subclasses) to cater for
    // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.

    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).

    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.

    // All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.
    public String bunType;
    public boolean meat;
    public String name;
    public double basePrice;

    public int maxAdditons;
    public int numberOfAdditions;
    public String addition1Name;
    public double addition1Cost;

    public String addition2Name;
    public double addition2Cost;

    public String addition3Name;
    public double addition3Cost;

    public String addition4Name;
    public double addition4Cost;

    public double totalPrice;

    public Hamburger(String bunType, boolean meat) {
        this.bunType = bunType;
        this.meat = meat;
        this.name = "Basic Burger";
        this.basePrice = 4.75;
        this.numberOfAdditions = 0;
        this.maxAdditons = 4;
        this.totalPrice = basePrice;
    }
    public Hamburger(String name) {
        if (name == "Garden Burger") {
            this.name = name;
            this.bunType = "Brown Rye";
            this.meat = false;
            this.basePrice = 5.25;
            this.numberOfAdditions = 0;
            this.maxAdditons = 6;
            this.totalPrice = basePrice;
        }
    }

    public Hamburger(String name, String bunType) {
        this.name = name;
        this.bunType = bunType;
        this.meat = true;
        this.basePrice = 6.33;
        this.numberOfAdditions = 0;
        this.maxAdditons = 2;
        this.totalPrice = this.basePrice;
        this.addItem("Fries", 0.75);
        this.addItem("Soda", 1.99);
    }

    public void addItem(String name, double price) {
        if (this.numberOfAdditions < this.maxAdditons) {
            switch(numberOfAdditions) {
                case 0:
                    addition1Name = name;
                    addition1Cost = price;
                    numberOfAdditions = 1;
                    totalPrice += price;
                    break;
                case 1:
                    addition2Name = name;
                    addition2Cost = price;
                    numberOfAdditions = 2;
                    totalPrice += price;
                    break;
                case 2:
                    addition3Name = name;
                    addition3Cost = price;
                    numberOfAdditions = 3;
                    totalPrice += price;
                    break;
                case 3:
                    addition4Name = name;
                    addition4Cost = price;
                    numberOfAdditions = 4;
                    totalPrice += price;
                    break;
            }
        } else {
            System.out.println("Max number of items added. You may not add any additional items.");
        }
    }
    public void breakdown() {
        System.out.println("Burger name: " + getName());
        System.out.println("Base price: " + getBasePrice());
        switch(numberOfAdditions) {
            case 0:
                System.out.println("There are no additional items yet.");
                break;
            case 1:
                System.out.println("1 additional item: " + getAddition1Name() + " - $" + getAddition1Cost());
                break;
            case 2:
                System.out.println("2 additional items: " + getAddition1Name() + " - $" + getAddition1Cost());
                System.out.println(getAddition2Name() + " - $" + getAddition2Cost());
                break;
            case 3:
                System.out.println("3 additional items: " + getAddition1Name() + " - $" + getAddition1Cost());
                System.out.println(getAddition2Name() + " - $" + getAddition2Cost());
                System.out.println(getAddition3Name() + " - $" + getAddition3Cost());
                break;
            case 4:
                System.out.println("4 additional items: " + getAddition1Name() + " - $" + getAddition1Cost());
                System.out.println(getAddition2Name() + " - $" + getAddition2Cost());
                System.out.println(getAddition3Name() + " - $" + getAddition3Cost());
                System.out.println(getAddition4Name() + " - $" + getAddition4Cost());
                break;

        }
        System.out.println("Total cost: $" + getTotalPrice());
    }
    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Cost() {
        return addition1Cost;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Cost() {
        return addition2Cost;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Cost() {
        return addition3Cost;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Cost() {
        return addition4Cost;
    }
}
