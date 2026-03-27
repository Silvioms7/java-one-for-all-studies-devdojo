package academy.devdojo.javaoneforall.javacore.minterfaces.test;


import academy.devdojo.javaoneforall.javacore.minterfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.javacore.minterfaces.domain.DatabaseLoader;
import academy.devdojo.javaoneforall.javacore.minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        System.out.println("----------------------------------------");
        databaseLoader.remove();
        fileLoader.remove();
        System.out.println("----------------------------------------");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("----------------------------------------");
        databaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
        System.out.println(DataLoader.MAX_DATA_SIZE);
    }
}
