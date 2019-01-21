public class PatternAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        Phone samsung = abstractFactory.create("PhoneFactory").createPhone("Samsung");
        Laptop dell = abstractFactory.create("LaptopFactory").createLaptop("Dell");
        samsung.sendMessage();
        dell.sendMessage();
    }
}

interface Phone {
    void sendMessage();
}

class Samsung implements Phone {

    @Override
    public void sendMessage() {
        System.out.println("You send message from a Samsung phone");
    }
}

class Iphone implements Phone {

    @Override
    public void sendMessage() {
        System.out.println("You send message from a Iphone phone");
    }
}

class PhoneFactory implements myFactory {
    public Phone createPhone(String phone) {
        switch (phone) {
            case "Samsung":
                return new Samsung();
            case "Iphone":
                return new Iphone();
            default:
                return null;
        }
    }

    @Override
    public Laptop createLaptop(String laptop) {
        return null;
    }
}

interface Laptop {
    void sendMessage();
}

class Asus implements Laptop {

    @Override
    public void sendMessage() {
        System.out.println("You send message from a Asus laptop");
    }
}

class Dell implements Laptop {

    @Override
    public void sendMessage() {
        System.out.println("You send message from a Dell laptop");
    }
}

class LaptopFactory implements myFactory {
    public Laptop createLaptop(String laptop) {
        switch (laptop) {
            case "Asus":
                return new Asus();
            case "Dell":
                return new Dell();
            default:
                return null;
        }
    }

    @Override
    public Phone createPhone(String phone) {
        return null;
    }
}

interface myFactory {
    Laptop createLaptop(String laptop);

    Phone createPhone(String phone);
}

class AbstractFactory {
    myFactory create(String factory) {
        switch (factory) {
            case "PhoneFactory":
                return new PhoneFactory();
            case "LaptopFactory":
                return new LaptopFactory();
            default:
                return null;
        }
    }
}

//You send message from a Samsung phone
//You send message from a Dell laptop