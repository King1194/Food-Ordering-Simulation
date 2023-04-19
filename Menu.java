package com.company.food;

public class Menu
{
    /* Menu Prices */
    private final double CHEESEBURGER_PRICE = 50.0;
    private final double FRENCH_FRIES_PRICE = 20.0;
    private final double DRINK_PRICE = 30.0;

    /* Menu Items */
    private final String CHEESEBURGER = "Cheeseburger";
    private final String FRIES = "Fries";
    private final String DRINK= "Drink";

    /* The amount of items currently on the menu */
    private final int totalMenuItems = 3;


    /* Displays menu options and prices */
    void displayMenu()
    {
        System.out.println("***************************");
        System.out.println("~Menu~");
        System.out.println("1) Cheeseburger Rs." + CHEESEBURGER_PRICE);
        System.out.println("2) Fries Rs." + FRENCH_FRIES_PRICE);
        System.out.println("3) Drink Rs." + DRINK_PRICE);
        System.out.println("***************************");
    }


    public double getCheeseburgerPrice()
    {
        return CHEESEBURGER_PRICE;
    }
    public double getFrenchFriesPrice()
    {
        return FRENCH_FRIES_PRICE;
    }
    public double getDrinkPrice()
    {
        return DRINK_PRICE;
    }
    public int getTotalMenuItems()
    {
        return totalMenuItems;
    }


    /***************************************************************************
     * Returns the name of the item that matches the item selection number,
     * Return blank string if menu item doesn't exist
     **************************************************************************/
    public String getMenuItemName(char itemSelection)
    {
        switch (itemSelection)
        {
            case '1':
                return CHEESEBURGER;
            case '2':
                return FRIES;
            case '3':
                return DRINK;
            default:
                return "";
        }
    }

    /***************************************************************************
     * Returns the price of the item that matches the itemSelection number
     * Return 0.00 if item doesn't exist
     **************************************************************************/
    double getMenuItemPrice(char itemSelection)
    {
        switch (itemSelection)
        {
            case '1':
                return CHEESEBURGER_PRICE;
            case '2':
                return FRENCH_FRIES_PRICE;
            case '3':
                return DRINK_PRICE;
            default:
                return 0.00;
        }
    }

}
