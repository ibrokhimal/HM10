package lesson10;

public class SwapElementsArray<E> {
    public void swapper(E[] array, int a, int b){
        E arrayElement = array[a];
        array[a] = array[b];
        array[b] = arrayElement;
    }
}
