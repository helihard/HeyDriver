abstract class Vehicle {
  protected Driver driver;
  protected int minimumAgeToDrive;
  protected String type;
  protected int milesToGo;
  protected int milesPerDrive;

  public Vehicle() {

  }

  public Vehicle(int minimumAgeToDrive, String type, int milesToGo, int milesPerDrive) {
    this.driver = null;
    this.minimumAgeToDrive = minimumAgeToDrive;
    this.type = type;
    this.milesToGo = milesToGo;
    this.milesPerDrive = milesPerDrive;
    System.out.println(String.format("%s created. %s miles to go!", type, milesToGo));
  }

  public void drive() {
    if (driver == null) {
      System.out.println(String.format("%s didn\'t drive - there\'s no driver!", type));
    } else if (driver.getAge() < minimumAgeToDrive) {
      System.out.println(String.format("%s didn\'t drive – %s is %s, but must be %s or older to drive %s", type, driver.getName(), driver.getAge(), minimumAgeToDrive, type.toLowerCase()));
    } else {
      milesToGo = calculateMileage(milesPerDrive);   
        if (milesToGo <= 0) {
        System.out.println(String.format("%s didn\'t drive - there are no more miles to go!", type));
        } else {
        System.out.println(String.format("%s drove %s miles - %s miles to go", type, milesPerDrive, milesToGo));
        }
    }
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    if (driver != null && driver.getAge() < minimumAgeToDrive) {
      System.out.println(String.format("Driver not changed! %s is %s, but must be %s or older to drive %s", driver.getName(), driver.getAge(), minimumAgeToDrive, type.toLowerCase()));
    } else {
      this.driver = driver;
      System.out.println("Driver changed to " + driver.getName());
    }
  }

  public int getMilesToGo() {
    return milesToGo;
  }

  public void setMilesToGo(int milesToGo) {
    this.milesToGo = milesToGo;
  }

  public int calculateMileage(int milesPerDrive) {
    milesToGo -= milesPerDrive;
    if (milesToGo < 0) {
      milesToGo = 0;
    }
    return milesToGo;
  }
}

class Car extends Vehicle {
  public Car() {
    super(18, "Car", 100, 10);
  }
}

class MilitaryTank extends Vehicle {
  public MilitaryTank() {
    super(25, "Tank", 2000, 5);
  }
}


