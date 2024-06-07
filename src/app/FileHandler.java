package app;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;


import static java.nio.file.Files.readString;

public class FileHandler {

    public String createFile(String strPath) {
        Path newFile;
        try {
            newFile = Files.createFile(Path.of(strPath));
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
        return "Created! " + newFile;
    }

    public String writeToFile(Path path, String content) {
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Recorded in " + path;
    }

    public String readFromFile(String strPath) {
        try {
            return readString(Path.of(strPath));
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }

}

