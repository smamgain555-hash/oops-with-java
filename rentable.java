interface Rentable {
    double calculateRent(int days);
}
class Car implements Rentable {
    static int totalVehiclesRented = 0;
    static final double TAX_RATE = 0.05;
    private final double rate = 1500;
    @Override
    public double calculateRent(int days) {
        totalVehiclesRented++;
        return rate * days;
    }
}
class Bike implements Rentable {
    static final double TAX_RATE = 0.05;
    private final double rate = 500;
    @Override
    public double calculateRent(int days) {
        Car.totalVehiclesRented++;
        return rate * days;
    }
}
