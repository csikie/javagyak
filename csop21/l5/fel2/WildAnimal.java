import javax.swing.text.AsyncBoxView;

public enum WildAnimal {
    MONKEY("banana", 10),
    ELEPHANT("apple", 30),
    GIRAFFE("orange", 25),
    RACOON("walnuts", 50);

    private final String fruit;
    private final int amount;

    WildAnimal(String fruit, int amount) {
        this.fruit = fruit;
        this.amount = amount;
    }
    
    public static String listAllAnimals() {
        StringBuilder sb = new StringBuilder();

        for (WildAnimal animal : WildAnimal.values()) {
            sb.append(animal.ordinal()+1).append(": ");
            sb.append(animal.name()).append(" szeretne enni ");
            sb.append(animal.amount*7).append(" ").append(animal.fruit);
            sb.append(" egy héten.");
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ordinal()+1).append(": ");
        sb.append(this.name()).append(" szeretne enni ");
        sb.append(this.amount*7).append(" ").append(this.fruit);
        sb.append(" egy héten.");

        return sb.toString();
    }
}
