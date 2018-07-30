public class Truck extends Car {

    private double cargo;
    private double consumpCargo;


    public Truck(String name, double tankCapacity, double avgConsumption, boolean airCondi, double cargo) {
        super(name, tankCapacity, avgConsumption, airCondi);
        this.cargo = cargo;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public double getConsumpCargo() {
        return consumpCargo;
    }

    public void setConsumpCargo(double consCargo) {
        this.consumpCargo = consCargo;
    }

    @Override
    public void turnOnAirCondi() {
        setAirCondi(true);
        setAvgConsumption(1.6 + getAvgConsumption());
    }

    public void turnOffAirCondi() {
        setAirCondi(false);
        setAvgConsumption(1.6 - getAvgConsumption());
    }

    public void topUpLoad() {

        consumpCargo = cargo / 200.0;
        if (consumpCargo > 0) {
            setAvgConsumption(getAvgConsumption() + consumpCargo);
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.print(", załadunek: " + cargo + " Kg");
    }

}


