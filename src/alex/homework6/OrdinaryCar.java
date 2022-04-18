package alex.homework6;

public class OrdinaryCar extends Car {

    private String carBrand;
    private int avgSpeed;
    private int fuel;

    public OrdinaryCar() {
    }

    public OrdinaryCar(String carBrand, int avgSpeed, int fuel) {
        this.carBrand = carBrand;
        this.avgSpeed = avgSpeed;
        this.fuel = fuel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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
            consumption = 5;
        } else if (avgSpeed <= 90) {
            consumption = 7;
        } else if (avgSpeed <= 130) {
            consumption = 9;
        } else if (avgSpeed <= 180) {
            consumption = 12;
        } else if (avgSpeed <= 230) {
            consumption = 17;
        } else if (avgSpeed <= 300) {
            consumption = 25;
        }
        int km = fuel / consumption * 100;
        System.out.println("On the most common car  " + fuel + " liters of fuel you will drive " + km +" km at an average speed "+ avgSpeed+"km/h");
    }

}

