package academy.devdojo.javaoneforall.javacore.npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.npolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the file");

    }
}
