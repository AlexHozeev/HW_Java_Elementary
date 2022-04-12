package alex.homework5;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 6", 60, 30);
        car1.kmPassed();
        NissanGibrid nissan = new NissanGibrid(60,30);
        nissan.kmPassed();
    }
}

