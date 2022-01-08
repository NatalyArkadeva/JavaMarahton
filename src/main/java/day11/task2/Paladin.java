package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private int healthHimself;

    public Paladin() {
        this.healthHimself = 25;
        super.setPhysAtt(15);
        super.setPhysDef(50);
        super.setMagicDef(20);
    }

    public int getHealthHimself() {
        return healthHimself;
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void healHimself() {
        this.setHealth(this.getHealth() + this.getHealthHimself());
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Paladin{health=" + this.getHealth() + "}";
    }

}
