public class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int maxHp;

    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void takeDamage(int damage) {
        hp = Math.max(0, hp - damage);
        System.out.println(name + " took " + damage + " damage!");
        if (hp == 0) {
            System.out.println(name + " fainted!");
        }
    }
}
