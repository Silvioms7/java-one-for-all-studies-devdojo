package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.npolymorphism.service.DatabaseRepositoryService;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {
    static void main(String[] args) {
        Repository repository =  new DatabaseRepositoryService();
        repository.save();
        List<String> list=new LinkedList<>();
        list.add("JC");
        list.add("Silvio");
        System.out.println(list);
    }
}
