package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();

        warrior.physAttack(paladin);
        System.out.println(paladin);
        paladin.physAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicAttack(paladin);
        System.out.println(paladin);
        shaman.physAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        warrior.physAttack(magician);
        System.out.println(magician);
        warrior.physAttack(magician);
        System.out.println(magician);
        warrior.physAttack(magician);
        System.out.println(magician);
        warrior.physAttack(magician);
        System.out.println(magician);
        warrior.physAttack(magician);
        System.out.println(magician);
    }
}
