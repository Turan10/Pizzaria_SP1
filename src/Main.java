import java.util.Scanner;


// in the Main class we initialize our code. We start out with the magic words of Java.

public class Main {
    public static void main(String[] args) {

        // From here we make our objects from the Pizza class that we made.

        Pizza[] list = new Pizza[30];
        list[0] = new Pizza(0, "Kebab", "Kebab, salat, løg, champignon", 74);
        list[1] = new Pizza(1, "Mozerella", "Mozarella, tomatsauce, hvidløgsolie", 86);
        list[2] = new Pizza(2, "Chicken", "Kylling, rød pebber, grøn pebber, jalapenos", 75);
        list[3] = new Pizza(3, "Pepperoni", "Pepperoni, chilli", 64);
        list[4] = new Pizza(4, "Lyngby", "pulled beef, champignon, majs, tomat", 94);
        list[5] = new Pizza(5, "Københavneren", "skinke, bacon, løg", 58);
        list[6] = new Pizza(6, "Datamatikeren", "Kødboller, ost, tomatsauce, dressing", 73);
        list[7] = new Pizza(7, "Turan", "Kebab, salat, dressing", 80);
        list[8] = new Pizza(8, "Matador)", "Kebab, champignoner, kylling, tomat, salat, dressing", 56);
        list[9] = new Pizza(9, "New Yorker", "Mozerella, paprika, tomatsauce", 72);


        // for the program to run and not stop until the user wants it to, I started out with a boolean
        // Then I created a while loop with a Switch case depending on the users choices.
        // It was important for me that the user always came back to the main menu where the categories are visible.
        // That's why we are looping through the program until the user wants to exit and presses 4.
        // In case 2 we are using a ParsInt method on nextline, so we can change the user input from a string to an int.
        // In case 3 we are taking the input that user puts to choose which of the elements in the array will be removed.
        // By doing this we are copying our existing array to a new one, with 1 index less everytime the user deletes, and that's why this isn't a durable solution, but it's the best that I could come up with right now :)
        // When the user chooses 4 the boolean value changes, and the program stops running.

        boolean stopProgram = false;

        while (!stopProgram) {
            System.out.println("Velkommen til Turan's Pizzaria. Hvad ønsker du?\n1.Se menu\n2. Tilføj en pizza\n3. Slet en pizza\n4.Afslut program");
            Scanner choice = new Scanner(System.in);
            String input = choice.nextLine();

            switch (input) {
                case "1":
                    for (Pizza p : list) {
                        if (p != null) {
                            System.out.println(p);
                        }
                    }


                    break;

                case "2":
                    System.out.println("Udfyld din pizza's oplysninger");
                    System.out.println("Start med at vælge et Menu nummer");
                    String newMenuNumber = choice.nextLine();
                    int newMenuNumberInt = Integer.parseInt(newMenuNumber);

                    System.out.println("Vælg nu hvad din pizza skal hedde");

                    String newPizzaName = choice.nextLine();

                    System.out.println("Vælg hvad din pizza skal indeholde");

                    String newPizzaContent = choice.nextLine();

                    System.out.println("Hvor meget skal denne pizza nu koste? ");

                    String newPizzaPrice = choice.nextLine();
                    int newPizzaPriceInt = Integer.parseInt(newPizzaPrice);


                    Pizza newPizza = new Pizza(newMenuNumberInt, newPizzaName, newPizzaContent, newPizzaPriceInt);

                    list[newMenuNumberInt] = newPizza;


                    break;


                case "3":
                    System.out.println("Hvilken pizza på menuen vil du slette?");
                    System.out.println("MenuID: ");

                    String deletePizzaID = choice.nextLine();
                    int deletePizzaIDInt = Integer.parseInt(deletePizzaID);

                    Pizza[] newList = new Pizza[list.length - 1];
                    for (int i = 0, j = 0; i < list.length; i++) {
                        if (i != deletePizzaIDInt) {
                            newList[j++] = list[i];

                        }
                    }
                    list = newList;


                    System.out.println("Pizza nummer: " + deletePizzaID + "er blevet slettet");


                    break;


                case "4":
                    stopProgram = true;

                    break;
                default:
                    System.out.println("Input skal være et tal mellem 1-4");
                    break;
            }


        }


    }


}

