package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    private int magicAtt;
    private int healthHimself;

    public Shaman() {
        this.healthHimself = 30;
        this.magicAtt = 15;
        super.setPhysAtt(10);
        super.setPhysDef(20);
        super.setMagicDef(20);
    }

    public int getHealthHimself() {
        return healthHimself;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public String toString() {
        return "Shaman{health=" + this.getHealth() + "}";
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void magicAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - this.getMagicAtt() * (100 - hero.getMagicDef()) / 100);
        System.out.println(hero);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + this.getHealthHimself());
        System.out.println(hero);

    }

    @Override
    public void healHimself() {
        this.setHealth(this.getHealth() + 50);
        System.out.println(this);

    }

}
