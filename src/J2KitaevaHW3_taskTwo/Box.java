package J2KitaevaHW3_taskTwo;


public class Box <T extends Fruit> {

    T[] fruitArray;

    public Box(T[] fruitArray) {
        this.fruitArray = fruitArray;
    }

    public Integer getTotalWeightArray() {
        Integer result = 0;
        for (T t : getFruitArray()) {
            if (t != null) {
                Integer value = t.getFruitWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compare(Box<? extends Fruit> box) {
        System.out.println("_____________________________________________________________");
        System.out.println("Weights of two containers (boxes) with two different types of fruits (oranges and apples) are the same. We need to compare and know the answer  - is it true or false?");

        if (this.getTotalWeightArray().intValue() == box.getTotalWeightArray().intValue()) return true;
        return false;
    }

    public void toEmptyArray(Box<T> box) {
        System.out.println("_____________________________________________________________");
        System.out.println("Total weight of the container (box) #1 after put fruits type 2 (oranges changed to apples) is " + box.getTotalWeightArray()+ " kg.");
        System.out.println("Total weight of the container (box) #2 after changing type of fruits (apples are changed to oranges) is " + this.getTotalWeightArray()+ " kg.");
        for (int i = 0; i < box.getFruitArray().length; i++) {
        }
    }

    public T[] getFruitArray() {
        return fruitArray;
    }

}