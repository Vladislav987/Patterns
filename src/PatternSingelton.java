public class PatternSingelton {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getSingelton();
        System.out.println(singelton.word); // Hello
        Singelton singelton1 = Singelton.getSingelton();
        singelton.word = "Good morning";
        System.out.println(singelton.word); // Good morning
    }
}
class Singelton{
    String word = "Hello";
    private static Singelton singelton = new Singelton();
    private Singelton(){}
    public static Singelton getSingelton(){
        return singelton;
    }
}

//Hello
//Good morning