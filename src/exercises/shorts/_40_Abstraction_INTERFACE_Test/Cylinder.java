package exercises.shorts._40_Abstraction_INTERFACE_Test;

public class Cylinder extends Shape implements VolumeInterface{
    // Came from Shape Abstract Class
    @Override
    public double area() {
        return 0;
    }

    // Came from Volume Interface Class
    @Override
    public double volume() {
        return 0;
    }
}
