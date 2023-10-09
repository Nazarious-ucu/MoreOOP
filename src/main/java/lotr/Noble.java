package lotr;

import java.util.Random;

public class Noble extends Character{

    private Random rand = new Random();

    public Noble(int min, int max) {
        super(new Random().nextInt(max - min + 1) + min, new Random().nextInt(max - min + 1) + min);
    }

    @Override
    public void kick(Character c) {
        // TODO Auto-generated method stub
        if (Integer.compare(getPower(), c.getPower()) > 0){
            c.setHp(0);
        }
        else{
            setPower(getPower() - this.getPower());
        }
    }
}
