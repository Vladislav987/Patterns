public class PatternAdapter {
    public static void main(String[] args) {
        PlaneWash planeWash = new PlaneWash();
        planeWash.wash(new Boing()); //Boing is clean
        planeWash.wash(new BikeWrapper(new Honda())); //Honda is clean
    }
}

class BikeWrapper implements Plane {
    Bike bike;

    public BikeWrapper(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void clean() {
        bike.clean();
    }
}

interface Bike {
    void clean();
}

class Honda implements Bike {
    @Override
    public void clean() {
        System.out.println("Honda is clean");
    }
}

interface Plane {
    void clean();
}

class Boing implements Plane {
    @Override
    public void clean() {
        System.out.println("Boing is clean");
    }
}

class PlaneWash {
    public void wash(Plane plane) {
        plane.clean();
    }
}

//Boing is clean
//Honda is clean