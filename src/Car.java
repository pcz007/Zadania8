public class Car extends Vehicle {

    private boolean airCondi;
    private double consAc;

    public Car(String name, double tankCapacity, double avgConsumption, boolean airCondi) {
        super(name, tankCapacity, avgConsumption);
        this.airCondi = airCondi;
    }

    public boolean isAirCondi() {
        return airCondi;
    }

    public void setAirCondi(boolean airCondi) {
        this.airCondi = airCondi;
    }

    public double getConsAc() {
        return consAc;
    }

    public void setConsAc(double consAc) {
        this.consAc = consAc;
    }

    public void turnOnAirCondi() {
        if (airCondi == false) {
            airCondi = true;
            setAvgConsumption(0.8 + getAvgConsumption());
        }
    }

    public void turnOffAirCondi() {
        if (airCondi== true) {
            airCondi = false;
            setAvgConsumption(getAvgConsumption()-0.8);
        }
    }

    public void info() {
        System.out.printf("\n %s, pojemność baku: %.0f L, średnie spalanie: %.1f L/100km, klimatyzacja: %b, zasięg: %.2f km",
                getName(), getTankCapacity(), getAvgConsumption(), airCondi, zwrocZasieg());
    }
}



