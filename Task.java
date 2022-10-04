import java.util.Random;

public class Task {
}

class Character {
    int power;
    int hp;

    public void kick(Character c) {

    }

    private boolean isAlive() {
        return true;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int i) {
        if (i >= 0) this.hp = i;
        else this.hp = 0;
    }

    public int getPower() {
        return power;
    }
    public String toString(){
        return this.getClass().getSimpleName() +"{hp=" + this.hp+
                ", power=" + this.power+"}";
    }
}

class Hobbit extends Character {
    public Hobbit() {
        power = 0;
        hp = 3;
    }

    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
    }
}

class Elf extends Character {
    public Elf() {
        power = 10;
        hp = 10;
    }

    public void kick(Character c) {
        if (c.power < this.power) c.hp = 0;
        else c.power -= 1;
    }
}

class King extends Character {
    public King() {
        power = 5;
        hp = 15;
    }

    public void kick(Character c) {
        Random r = new Random();
        c.hp -= r.nextInt(5, 15);
    }
}

class Knight extends Character {
    public Knight() {
        power = 2;
        hp = 12;
    }

    public void kick(Character c) {
        Random r = new Random();
        c.hp -= r.nextInt(2, 12);
    }
}

class CharacterFactory {
    Character createCharacter() {
        Random r = new Random();
        int n = r.nextInt(0, 4);
        switch (n) {
            case 0:
                return new Hobbit();
            case 1:
                return new King();
            case 2:
                return new Knight();
            case 3:
                return new Elf();
        }
        return new Hobbit();
    }
}

class GameManager {

    void fight(Character c1, Character c2) {

    }
}