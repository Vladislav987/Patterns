import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class PatternFasade {
    public static void main(String[] args) throws IOException {
        FileReadFasade fileReadFasade = new FileReadFasade();
        System.out.println(fileReadFasade.readFile("D:\\IdeaProjects\\Patterns\\src\\text.txt"));
    }
}

class FileReadFasade {
    String readFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        while ((j = bufferedReader.read()) != -1) {
            stringBuilder.append((char) j);
        }
        return stringBuilder.toString();
    }
}

//hello
//good morning