public enum WildAnimal {
    MONKEY("banana", 10),
    ELEPHANT("apple", 20),
    GIRAFFE("leafe", 25),
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
            sb.append(animal);
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ordinal() + 1)
          .append(": ")
          .append(this.name())
          .append(" szeretne enni ")
          .append(this.amount*7)
          .append(" ").append(this.fruit)
          .append(" egy héten.");

        return sb.toString();
    }
}
