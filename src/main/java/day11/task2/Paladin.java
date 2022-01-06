package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{
    private int healthHimself;

    public Paladin(){
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
        this.setHealth(this.getHealth()+this.getHealthHimself());
    }

    @Override
    public void physAttack(Hero hero) {
        hero.setHealth(hero.getHealth()-this.getPhysAtt()*(100- hero.getPhysDef())/100);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth()+30);
    }

    @Override
    public String toString() {
        return "Paladin{health=" + this.getHealth() + "}";
    }

}
