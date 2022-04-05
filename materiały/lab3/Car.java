package pl.krakow.up;

public class Car extends Vehicle {
    private int distance;
    private int maxFuel;
    private int fuel;

    public Car(String make,
               String model,
               String plateNo,
               int distance,
               int maxFuel,
               int fuel) {
        super(make, model, plateNo);
        this.distance = distance;
        this.maxFuel = maxFuel;
        this.fuel = fuel;
    }

    public int getDistance() {
        return distance;
    }

    public int getFuel() {
        return fuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", maxFuel=" + maxFuel +
                ", fuel=" + fuel +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", plateNo='" + plateNo + '\'' +
                '}';
    }
}
