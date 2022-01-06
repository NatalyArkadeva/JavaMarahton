package day11.task2;

public abstract class Hero {
    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;
    static final int MINHEALTH = 0;
    static final int MAXHEALTH = 100;

    public Hero() {
        this.health = 100;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health >= MAXHEALTH) {
            this.health = MAXHEALTH;
        } else if (this.health < MINHEALTH) {
            this.health = MINHEALTH;
        }
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }


}
