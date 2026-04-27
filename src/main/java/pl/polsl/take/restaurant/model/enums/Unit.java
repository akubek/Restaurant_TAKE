package pl.polsl.take.restaurant.model.enums;

public enum Unit {
    GRAM("g"),
    DECAGRAM("dag"),
    KILOGRAM("kg"),
    MILLILITER("ml"),
    DECILITER("dl"),
    LITER("l"),
    PIECE("szt.");

    private final String symbol;

    Unit(String symbol) {
        this.symbol = symbol;
    }
}
