package alex.homework6;

public class NissanGibrid extends Car {

    public static final int ELECTROMODE = 30;

    private int avgSpeed;
    private int fuel;

    public NissanGibrid() {
    }

    public NissanGibrid(int avgSpeed, int fuel) {
        this.avgSpeed = avgSpeed;
        this.fuel = fuel;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setAvgSpeed(int avgSpeed) {
        if (avgSpeed > 300) this.avgSpeed = 300;
        this.avgSpeed = avgSpeed;
    }

    public void setFuel(int fuel) {
        if (fuel > 60) this.fuel = 60;
        this.fuel = fuel;
    }


    public void kmPassed() {
        int consumption = 0;
        if (avgSpeed <= 60) {
            consumption = 4;
        } else if (avgSpeed <= 90) {
            consumption = 5;
        } else if (avgSpeed <= 130) {
            consumption = 7;
        } else if (avgSpeed <= 180) {
            consumption = 11;
        } else if (avgSpeed <= 230) {
            consumption = 15;
        } else if (avgSpeed <= 300) {
            consumption = 22;
        }
        int km = fuel / consumption * 100 + ELECTROMODE;
        System.out.println("On this new gibrid car " + fuel + " liters of fuel you will drive " + km +" km at an average speed "+ avgSpeed+"km/h");
    }

}

