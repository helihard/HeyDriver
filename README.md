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

Min motivering:
Jag valde att använda mig av instansvariabler i Vehicle-klassen (type, milesToGo etc) i stället för av polymorfism, detta för att undvika kodduplicering.
  * Dels skulle drive() enligt instruktionerna printa likadant formulerade budskap ("X didn’t drive - there’s no driver!" och "X drove Y miles - Z miles to go") oavsett fordonstyp, där det enda som skilde budskapen åt var subklassernas individuella typer (Car, Tank) och individuella antal miles.
  * Dels skulle logiken för drive() vara densamma – metoden skulle kontrollera om fordonet hade en förare, och köra eller inte köra beroende på resultatet, oavsett om fordonet var en Car eller en MilitaryTank.

Eftersom det inte var några skillnader mellan de olika fordonstypernas beteende som inte kunde lösas med instansvariabler krävdes ingen större flexibilitet för subklasserna, som det hade gjort om drive() skulle printa mindre lika budskap eller ha olika logik beroende på fordonstyp. Det kändes inte motiverat att använda polymorfism, även om det så klart är värdefullt att öva också på det.

Jag valde att använda mig av en abstrakt klass i stället för av ett interface. 
  * En konkret anledning är att redan "Vehicle v1 = new Car();" inte skulle ha fungerat som avsett, eftersom interfaces inte kan innehålla konstruktörer.
  * Om jag hade använt mig av ett interface skulle jag ha varit tvungen att använda @Override på drive-metoden i varje individuell subklass, eftersom jag inte skulle ha kunnat definiera någon gemensam logik för subklasserna i drive-metoden i ett interface. Som jag beskrivit ovan ville jag undvika kodduplicering.
  * Med en abstrakt klass kunde jag använda instansvariabler, som medger delad logik, direkt i Vehicle-klassen i stället för i de individuella subklasserna. Också det gjorde att jag kunde undvika kodduplicering.
