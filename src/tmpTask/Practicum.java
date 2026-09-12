package tmpTask;

class Coffee {
    String coffeeName;
    String clientName;
    boolean isCinnamon;

    public Coffee(String newCoffeeName, String newClientName, boolean isNewCinnamon) {
        coffeeName = newCoffeeName;
        isCinnamon = isNewCinnamon;
        clientName = newClientName;
    }
}

public class Practicum {
    public static void main(String[] args) {
        Coffee c = new Coffee ("Капучино", "Маша", true);
    }
}