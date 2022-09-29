
// To make the program, the first thing we do is to make a class. Java is build around classes, and that's why everything must be in a class in java.
public class Pizza {

    String pizzatype;
    String content;
    int price;
    int menuID;

    // After giving our class the ingredients needed to make the object(also called properties).
    // We then use these properties to make our recipe (Also known as a constructor)
    Pizza(int menuID, String pizzatype, String content, int price) {
        this.pizzatype = pizzatype;
        this.price = price;
        this.content = content;
        this.menuID = menuID;

    }
    // For the system to print out our objects in the system console, we need to use the toString method

    public String toString() {
        return "nr " + this.menuID + ", " + this.pizzatype + ", " + this.content + ", " + this.price;

    }

}



