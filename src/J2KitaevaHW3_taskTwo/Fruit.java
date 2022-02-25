package J2KitaevaHW3_taskTwo;

public abstract class Fruit {

    private String fruitName;
    private Integer fruitWeight;

    public Fruit (String fruitName, Integer fruitWeight) {
        this.fruitName = fruitName;
        this.fruitWeight = fruitWeight;
    }

    public String getFruitName() {
        return fruitName;
    }

    public Integer getFruitWeight() {
        return fruitWeight;
    }
}