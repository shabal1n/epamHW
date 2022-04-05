public class classesHierarchy {
    public static void main(String[] args) {
//        Transport transport = new Transport(1524.2, 5, "diesel");
//        transport.printInfo();
//
//        Transport car = new Car(1524.2, 5, "diesel", "sedan", "manual", "front-wheel drive");
//        car.printInfo();

        Transport bmw = new BMW(1524.2, 5, "diesel",
                "sedan", "manual", "front-wheel drive",
                "M5", "Competition", 2020);
        bmw.printInfo();
    }
}

class Transport {
    private double weightInKilograms;   //вес в кг
    private int humanCapacity;      //вместимость пассажиров
    private String engineFuel;      //топливо

    Transport() {
    }

    Transport(double weightInKilograms, int humanCapacity, String engineFuel) {
        this.weightInKilograms = weightInKilograms;
        this.humanCapacity = humanCapacity;
        this.engineFuel = engineFuel;
    }

    void printInfo() {
        System.out.println("Weight(kg): " + weightInKilograms + "\nHuman capacity: " + humanCapacity +
                "\nFuel of engine: " + engineFuel);
    }
}

class Car extends Transport {
    private String bodyType;    //кузов
    private String transmission;    //АКПП
    private String wheelsDrive;     //привод

    Car() {
    }

    Car(double weight, int humanCapacity, String engineFuel, String bodyType, String transmission, String wheelsDrive) {
        super(weight, humanCapacity, engineFuel);
        this.bodyType = bodyType;
        this.transmission = transmission;
        this.wheelsDrive = wheelsDrive;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("Body type: " + bodyType + "\nTransmission: " + transmission +
                "\nDriving wheels: " + wheelsDrive);
    }
}

class BMW extends Car {
    private String model;       //модель
    private String equipmentName;       //название комплектации
    private int yearOfProduction;       //год выпуска

    BMW() {
    }

    BMW(double weight, int humanCapacity, String engineFuel,
        String bodyType, String transmission, String wheelsDrive,
        String model, String equipmentName, int yearOfProduction) {

        super(weight, humanCapacity, engineFuel, bodyType, transmission, wheelsDrive);
        this.model = model;
        this.equipmentName = equipmentName;
        this.yearOfProduction = yearOfProduction;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("Model: " + model + "\nEquipment: " + equipmentName +
                "\nYear: " + yearOfProduction);
    }
}
