package academy.devdojo.javaoneforall.javacore.minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 45;
    void load();

    default void checkPermission() {
        System.out.println("Checking permission general");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in the DataLoader");
    }
}
