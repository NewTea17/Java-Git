package org.example;

import org.example.repo.impl.TodoRepoImpl;
import org.example.repo.impl.UserRepoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        UserRepoImpl userRepo = new UserRepoImpl();
        userRepo.findByEmail("new88337");
        TodoRepoImpl todoRepo = new TodoRepoImpl();
        System.out.println(todoRepo.getTodoByName("Some todo"));
    }
}
