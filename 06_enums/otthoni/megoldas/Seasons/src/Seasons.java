public enum Seasons {

    SPRING ("Tavasz"),
    SUMMER("Nyár"),
    FALL("Ősz"),
    WINTER("Tél");

    private final String name;

    Seasons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
