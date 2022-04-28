package alex.homework7;


public class Main {
    public static void main(String[] args) {
        OrdinaryCar ordinaryCar1 = new OrdinaryCar("VAZ-2107",90 , 30);
        ordinaryCar1.kmPassed();
        NissanHibrid nissan = new NissanHibrid(89,30);
        nissan.kmPassed();
    }
}

