import java.util.Scanner;

public class Fleet {

    public static void main(String[] args) {

        Car[] cars = new Car[2];
        Truck[] trucks = new Truck[2];

        cars[0] = new Car("Toyota", 45, 7.5, false);
        cars[1] = new Car("Mitsubishi", 55, 10, false);
        trucks[0] = new Truck("Scania", 300, 30, false, 0);
        trucks[1] = new Truck("Daf", 600, 40, false, 0);

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj załadunek ciężarówki nr 1 (w KG)");
        trucks[0].setCargo(scan.nextDouble());
        trucks[0].topUpLoad();
        System.out.println("Podaj załadunek ciężarówki nr 2 (w KG)");
        trucks[1].setCargo(scan.nextDouble());
        trucks[1].topUpLoad();

        cars[0].info();
        cars[1].info();
        trucks[0].info();
        trucks[1].info();

        System.out.println("\n\nWłączanie klimatyzacji we wszystkich pojazdach...");
        cars[0].turnOnAirCondi();
        cars[1].turnOnAirCondi();
        trucks[0].turnOnAirCondi();
        trucks[1].turnOnAirCondi();

        cars[0].info();
        cars[1].info();
        trucks[0].info();
        trucks[1].info();
    }
}
