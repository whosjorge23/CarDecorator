public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
        System.out.println("\n*****");

        Car basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println("\n*****");

        Car suvCar = new SportsCar(new LuxuryCar(new SuvCar()));
        suvCar.assemble();
    }
}
