package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Петя");
        User user2 = new User("Вася");
        User user3 = new User("Федя");

        user1.sendMessage(user2, "Hello " + user2.getName() + "!");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Hello " + user1.getName() + "!");
        user2.sendMessage(user1, "Fine!");
        user2.sendMessage(user1, "123");
        user3.sendMessage(user1, "i am user 3");
        user3.sendMessage(user1, "i am user 3");
        user3.sendMessage(user1, "i am user 3");
        user1.sendMessage(user3, "Hello " + user3.getName() + "!");
        user1.sendMessage(user3, "Hello " + user3.getName() + "!");
        user1.sendMessage(user3, "Hello " + user3.getName() + "!");
        user3.sendMessage(user1, "i am user 3");

        MessageDatabase.showDialog(user1, user2);
        System.out.println(new Message(user1, user2, "123"));

    }
}
