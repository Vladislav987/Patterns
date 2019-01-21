public class PatternDAO {
    static Data data = new FileSystem();

    // or
    // static Data data = new Db(); (then output will be --- data from table)
    public static void main(String[] args) {
        System.out.println(data.getData()); //data from file system
    }
}

interface Data {
    String getData();
}

class Db implements Data {
    String getFromTable() {
        return "data from table";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}

class FileSystem implements Data {
    String getDataFromFs() {
        return "data from file system";
    }

    @Override
    public String getData() {
        return getDataFromFs();
    }
}
