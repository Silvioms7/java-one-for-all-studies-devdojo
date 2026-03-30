package academy.devdojo.javaoneforall.javacore.oexception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader02 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Closing Reader 02");
    }
}
