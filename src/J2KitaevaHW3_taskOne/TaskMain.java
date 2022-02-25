package J2KitaevaHW3_taskOne;

import java.util.Arrays;

public class TaskMain {

    static String[] arrayString = {"A - the 1st element", "B - the 2nd element", "C - the 3rd element", "D - the 4th element"};
    static Integer[] arrayInteger = {9, 8, 7, 6};


    public static void main(String[] args) {
        ChangeArray<Object> changeArray = new ChangeArray<>();

        System.out.println(Arrays.toString(changeArray.changeElements(arrayString, 1, 0)));


        System.out.println(Arrays.toString(changeArray.changeElements(arrayInteger, 2, 1)));

    }
}

