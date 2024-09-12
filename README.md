Övning:

Hej Bilist!
Skapa Driver, Vehicle, Car och MilitaryTank med lämpliga
instansvariabler och metoder, så att koden nedan fungerar och ger den
korrekta utskriften.
Driver d1 = new Driver(“Emilia”, 17);
Driver d2 = new Driver(“Niklas”, 21);
Vehicle v1 = new Car(); // Prints “Car created. 100 miles to go!”
Vehicle v2 = new MilitaryTank(); // Prints “Tank created. 2000 miles to go!”
v1.drive(); // Prints “Car didn’t drive - there’s no driver!”
v2.drive(); // Prints “Tank didn’t drive - there’s no driver!”
v1.setDriver(d1); // Prints “Driver not changed! Emil is 17, but must be 18 or
older to drive car”
v1.setDriver(d2); // Prints “Driver changed to Niklas”
v2.setDriver(d2); // Prints “Driver not changed! Niklas is 21, but must be 25 or
older to drive tank”
v2.setDriver(new Driver(“TankMan”, 300)); // Prints “Driver changed to
TankMan”
v1.drive(); // Prints “Car drove 10 miles - 90 miles to go”
v2.drive(); // Prints “Tank drove 5 miles - 1995 miles to go”

1. Skapa Driver
2. Skapa Vehicle
3. Skapa Car
4. Skapa MilitaryTank
5. Motivera
Motivera koden du skrev ovan. Hur valde du att realisera de olika typerna?
Vad skulle fördelarna/nackdelarna ha varit mellan att välja något annat?
(Interface, klass, abstrakt klass)
