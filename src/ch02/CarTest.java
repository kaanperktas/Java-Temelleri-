package ch02;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("When the car stands still.");
        car1.make = "Audi";
        car1.model = "A6";
        car1.year = "2022";
        car1.distance = 0;
        car1.speed = 0;

        String info = car1.getInfo();
        System.out.println(info);

        System.out.println("\nWhen the car moves");
        car1.accelerate(125);
        car1.go(200);
        car1.go(100);
        System.out.println(car1.getInfo());
        car1.stop();
        System.out.println(car1.getInfo());
    }
}
