public class App {
    public static void main(String[] args) throws Exception {

        Driver d1 = new Driver("Emilia", 17);
        Driver d2 = new Driver("Niklas", 21);
        Vehicle v1 = new Car(); // Prints "Car created. 100 miles to go!"
        Vehicle v2 = new MilitaryTank(); // Prints "Tank created. 2000 miles to go!"
        v1.drive(); // Prints "Car didn’t drive - there’s no driver!"
        v2.drive(); // Prints "Tank didn’t drive - there’s no driver!""
        v1.setDriver(d1); // Prints "Driver not changed! Emilia is 17, but must be 18 or older to drive car"
        v1.setDriver(d2); // Prints "Driver changed to Niklas"
        v2.setDriver(d2); // Prints "Driver not changed! Niklas is 21, but must be 25 or older to drive tank"
        v2.setDriver(new Driver("TankMan", 300)); // Prints "Driver changed to TankMan"
        v1.drive(); // Prints "Car drove 10 miles - 90 miles to go"
        v2.drive(); // Prints "Tank drove 5 miles - 1995 miles to go"
        v2.drive();
        v2.drive();
    }
}
