package lesson01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box <T extends Fruit>{

    private ArrayList<T> box = new ArrayList<>();

    public ArrayList<T> getBox() {
        return box;
    }


    public void add(T fruit){
        box.add(fruit);
    }

    public float getWeight(){
        float wieght = 0;
        for (T t : box) {
            wieght += t.getWeight();
        }
        return  wieght;
    }

    public boolean compare(Box<?> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    public boolean sprinkle(Box<T> destBox){
        if(box.size() == 0 | destBox == this) return false;


        destBox.getBox().addAll(box);
        box.clear();
        return true;
    }
}
