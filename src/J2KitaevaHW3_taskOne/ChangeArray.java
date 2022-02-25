package J2KitaevaHW3_taskOne;

public class ChangeArray <T> {

    T changeValue;

    public T[] changeElements(T[] array, int indexA, int indexB) {
        changeValue = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = changeValue;
        return array;
    }

}
