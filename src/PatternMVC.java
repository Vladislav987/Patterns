public class PatternMVC {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.execute();
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

interface ModelLyaer {
    Person getPerson();
}

class DBLayer implements ModelLyaer {
    // Choose a Person from DB
    @Override
    public Person getPerson() {
        return new Person();
    }
}

class Controler {
    private ModelLyaer modelLyaer = new DBLayer();
    private View view = new ConsoleView();

    void execute() {
        Person person = modelLyaer.getPerson();
        view.showPerson(person);
    }
}

interface View {
    void showPerson(Person person);
}

class ConsoleView implements View {
    @Override
    public void showPerson(Person person) {
        System.out.println("Person name: " + person.getName() + " age: " + person.getAge());
    }
}
