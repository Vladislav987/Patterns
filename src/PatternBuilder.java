public class PatternBuilder {
    public static void main(String[] args) {
        Truck truck = new Truck.Builder("Mersedes").setColor("black").setMaxSpeed(140).build();
        System.out.println(truck.toString()); //Truck{name='Mersedes', color='black', maxSpeed=140}

    }
}

class Truck {
    private String name;
    private String color;
    private int maxSpeed;

    private Truck(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Truck build() {
            return new Truck(this);
        }
    }
}

//Truck{name='Mersedes', color='black', maxSpeed=140}

