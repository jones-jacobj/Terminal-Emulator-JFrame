/**
 * A thing that exists in the world- a player, an enemy, an NPC
 */
public class Entity {
    private String name;
    private int level, hp, hpMax, exp, exp2lvl;

    /**
     *
     * @param name  String reference to entity
     * @param level Foundation for constructing other values automatically; as multiples of level
     */
    public Entity(String name, int level){
        this.name = name;
        this.level = level;
        this.hp = level * 10;
        this.hpMax = this.hp;
        this.exp = 0;
        this.exp2lvl = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExp2lvl() {
        return exp2lvl;
    }

    public void setExp2lvl(int exp2lvl) {
        this.exp2lvl = exp2lvl;
    }
}
