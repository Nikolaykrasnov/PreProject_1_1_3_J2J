package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        /*userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        userService.saveUser("Petr", "Petrov", (byte) 30);
        userService.saveUser("Anna", "Sidorova", (byte) 22);

        List<User> users = userService.getAllUsers();

        for (User user : users) {
            System.out.println(user);
        }*/

        //userService.removeUserById(2);

        //userService.cleanUsersTable();

        //userService.dropUsersTable();

    }
}
