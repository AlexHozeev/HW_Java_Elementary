package alex.homework6;


public class Main {
    public static void main(String[] args) {
        OrdinaryCar ordinaryCar1 = new OrdinaryCar("VAZ-2107",90 , 30);
        ordinaryCar1.kmPassed();
        NissanGibrid nissan = new NissanGibrid(90,30);
        nissan.kmPassed();
    }
}

