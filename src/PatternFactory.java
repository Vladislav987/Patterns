public class PatternFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Transport toyota = factory.create("Toyota");
        Transport bmv = factory.create("BMW");
        toyota.drive();
        bmv.drive();
    }
}


interface Transport {
     void drive();
}

class Toyota implements Transport {
    @Override
    public void drive() {
        System.out.println("You drive a Toyota");
    }
}

class Bmw implements Transport {
    @Override
    public void drive() {
        System.out.println("You drive a BMW");
    }
}

class Factory {
    public Transport create(String transport) {
        switch (transport) {
            case "Toyota":
                return new Toyota();
            case "BMW":
                return new Bmw();
            default:
                return null;
        }
    }
}
//You drive a Toyota
//You drive a BMW




