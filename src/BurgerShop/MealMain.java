package BurgerShop;

public class MealMain {
    public static void main(String[] args) {
        Item coke = new Item("drink", "COKE", 1.5);
        coke.printItem();
        coke.setSize("Large");
        coke.printItem();

        System.out.println("-".repeat(50));

        Burger burger = new Burger("regular", 4);
        burger.addToppings("Bacon", "TOMATO", "");
        burger.printItem();

        System.out.println("-".repeat(50));

        MealOrder regularMeal = new MealOrder();
        regularMeal.printItemizedList();
        regularMeal.addBurgerToppings("BBQ", "CHEDDAR", "LETTUCE");
        regularMeal.setDrinkSize("large");
        regularMeal.printItemizedList();

        System.out.println("-".repeat(50));

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "onion rings");
        deluxeMeal.addBurgerToppings("BBQ", "CHEDDAR", "LETTUCE", "BACON", "TOMATO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
