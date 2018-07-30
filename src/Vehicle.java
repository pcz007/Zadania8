public class Vehicle {

    private String name;
    private double tankCapacity;
    private double avgConsumption;
    private double zasieg;

    public Vehicle(String name, double tankCapacity, double avgConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgConsumption = avgConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAvgConsumption() {
        return avgConsumption;
    }

    public void setAvgConsumption(double avgConsumption) {
        this.avgConsumption = avgConsumption;
    }

    public double getZasieg() {
        return zasieg;
    }

    public void setZasieg(double zasieg) {
        this.zasieg = zasieg;
    }

    public double zwrocZasieg() {
        zasieg = (100 * getTankCapacity() / getAvgConsumption());
        return zasieg;
    }
}
