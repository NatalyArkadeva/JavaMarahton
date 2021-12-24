package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int stamina;
        Player player1 = new Player(stamina = random.nextInt(11) + 90);
//        Player player2 = new Player(stamina = random.nextInt(11) + 90);
//        Player player3 = new Player(stamina = random.nextInt(11) + 90);
//        Player player4 = new Player(stamina = random.nextInt(11) + 90);
//        Player player5 = new Player(stamina = random.nextInt(11) + 90);
//        Player player6 = new Player(stamina = random.nextInt(11) + 90);
//        Player player7 = new Player(stamina = random.nextInt(11) + 90);

        Player.info();
        System.out.println(Player.getCountPlayers());

        System.out.println(player1.getStamina());

        player1.run();

        System.out.println(player1.getStamina());
        System.out.println(Player.getCountPlayers());
    }
}
