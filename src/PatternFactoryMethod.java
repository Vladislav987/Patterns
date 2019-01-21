public class PatternFactoryMethod {
    public static void main(String[] args) {
        Student student = Student.createStudent();
    }

}

class Student {
    private Student() {
    }

    public static Student createStudent() {
        return new Student();
    }
}