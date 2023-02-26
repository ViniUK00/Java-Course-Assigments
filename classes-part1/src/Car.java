public class Car {

    private String make = "Tesla";
    private int door = 2;
    private String color = "Grey";
    private Boolean convertible = true;

    public void describeCar() {
        System.out.println(door + "-door " + make + " " + color + (convertible ? " Convertible" : " "));
    }

    public String getMake() {
        return make;
    }

    public int getDoor() {
        return door;
    }

    public String getColor() {
        return color;
    }

    public Boolean getConvertible() {
        return convertible;
    }
}
