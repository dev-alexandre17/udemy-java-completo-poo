package entities;

public class Student {

    public String name;
    public Double x, y, z;

    public double finalArrange(Double x, Double y, Double z){
        return (x + y + z);
    }

    public void noteValidation() {
        if ((x + y + z) >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", (60 - (x + y + z)));
        }
    }

}
