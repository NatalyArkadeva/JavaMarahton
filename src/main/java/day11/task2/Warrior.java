package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super.setPhysAtt(30);
        super.setPhysDef(80);
        super.setMagicDef(0);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public String toString() {
        return "Warrior{health=" + this.getHealth() + "}";
    }

    @Override
    public void physAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - this.getPhysAtt() * (100 - hero.getPhysDef()) / 100);

    }
}
