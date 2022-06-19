package lesson10;

public class Box<E> {
    private E[] fruitArray;
    private double weight;

    public double getWeight() {
        weight = fruitArray.length * weight;
        return weight;
    }

    public Box(E[] fruitArray, double weightFruit) {
        this.weight = weightFruit;
        this.fruitArray = fruitArray;
    }

    public boolean compare(Box<?> box){
        Comparable a = getWeight();
        Comparable b = box.getWeight();
        if (a.compareTo(b) > 0) {
            return false;
        }
        return true;
    }

    public void changeBox(Box<E> box) {
        fruitArray = (E[]) new Object[fruitArray.length + box.fruitArray.length];
        box.fruitArray = (E[]) new Object[0];
    }

    public void add(){
        fruitArray = (E[]) new Object[fruitArray.length + 1];
    }
}
