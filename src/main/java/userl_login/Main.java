package userl_login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите логин");
            String login = scanner.nextLine();
            System.out.println("Введите пароль");
            String password = scanner.nextLine();
            getUserByLoginAndPassword(login, password);
            vailedateUser(getUserByLoginAndPassword(login, password));
            System.out.println("Доступ предоставлен");
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (AccessDeniedException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }

    }

    public static User[] getUsers() {
        User user1 = new User("Petya", "pass1", 25, "petr1996@gmail.com");
        User user2 = new User("Polina", "pass2", 16, "polya@gmail.com");
        User user3 = new User("Ivan", "pass3", 32, "ivan89@gmail.com");
        User user4 = new User("Andrey", "pass4", 17, "andrusha@gmail.com");
        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers(); //User[]{user1,user2,user3, user4};
        for (User user : users) {
            if ((user.login).equals(login) & (user.password).equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void vailedateUser(User user) throws AccessDeniedException {

        if (user.age < 18) throw new AccessDeniedException("Возвраст меньше 18 лет");

    }
}

