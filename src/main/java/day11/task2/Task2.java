package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();

        warrior.physAttack(paladin);
        paladin.physAttack(magician);
        shaman.healTeammate(magician);
        magician.magicAttack(paladin);
        shaman.physAttack(warrior);
        paladin.healHimself();
        warrior.physAttack(magician);
        warrior.physAttack(magician);
        warrior.physAttack(magician);
        warrior.physAttack(magician);
        warrior.physAttack(magician);
    }
}
