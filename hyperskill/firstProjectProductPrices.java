public enum firstProjectProductPrices {
    BUBBLEGUM(2.0, "pink"),
    TOFFEE(.2,"tan"),
    ICE_CREAM(3.0,"white"),
    MILK_CHOCOLATE (2.0,"dark brown"),
    DOUGHNUT (2.5,"gold"),
    PANCAKE (3.2,"light brown");

    private final double price;
    private final String color;

    firstProjectProductPrices(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

}
