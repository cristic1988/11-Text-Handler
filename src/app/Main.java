package app;


import java.nio.file.Paths;

public class Main {

    private static final String BASE_PATH = "E:/Java Pro/Homework/11 Text-Handler/Text-Handler/files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String newFileName = "myfile";
        String content = "Super information.";
        String path = BASE_PATH + newFileName + ".txt";
        // Виклики методів маніпуляції з файлом
        getOutput(handler.createFile(path));
        getOutput(handler.writeToFile(Paths.get(path), content));
        getOutput("CONTENT: " + handler.readFromFile(path));
    }

    private static void getOutput(String output) {
        System.out.println(output);


    }
}