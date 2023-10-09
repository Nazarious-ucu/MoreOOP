package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @AllArgsConstructor @Setter
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character c);

    public boolean isAlive(){
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower()+ "}";
    }


    public void setHp(int new_hp){
        if (new_hp > 0){
            this.hp = new_hp;
        }
        else{
            this.hp = 0;
        }
    }
}
