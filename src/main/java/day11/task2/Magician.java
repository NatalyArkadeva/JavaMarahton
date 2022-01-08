package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    private int magicAtt;

    public Magician(){
        this.magicAtt = 20;
        super.setPhysAtt(5);
        super.setPhysDef(0);
        super.setMagicDef(80);
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }



    @Override
    public void magicAttack(Hero hero) {
        hero.setHealth(hero.getHealth()-this.getMagicAtt()*(100- hero.getMagicDef())/100);
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Magician{health=" + this.getHealth() + "}";
    }
}
