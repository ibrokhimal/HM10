package lesson10;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5"};
        SwapElementsArray<String> stringSwapElementsArray = new SwapElementsArray<>();
        stringSwapElementsArray.swapper(array, 1, 2);

        Apple[] apples = new Apple[20];
        Apple[] apples2 = new Apple[10];
        Orange[] orange = new Orange[20];

        Box<Apple> appleBox = new Box<>(apples, 1.5);
        Box<Apple> appleBox2 = new Box<>(apples2, 1.5);
        Box<Orange> orangeBox = new Box<>(orange, 1.0);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
        appleBox.changeBox(appleBox2);

    }
}
