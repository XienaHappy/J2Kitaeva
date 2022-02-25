package J2KitaevaHW3_taskOne;

import java.util.Arrays;

public class J2KitaevaHW3TaskOneMain {

    static String[] arrayString = {"A - the 1st element before change", "B - the 2nd element before change", "C - the 3rd element before change", "D - the 4th element before change"};
    static Integer[] arrayInteger = {10, 9, 8, 7};


    public static void main(String[] args) {
        System.out.println("_____________________________________________________________");
        System.out.println("Hello! Following is the task #1, Homework3:");
        System.out.println("_____________________________________________________________");

        System.out.println("This is how the original Array with text elements looks like:");
        System.out.println(Arrays.toString(arrayString));
        System.out.println("_____________________________________________________________");

        System.out.println("And this is how the original Array with figures elements looks like:");
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println("_____________________________________________________________");

        System.out.println("Finally, here we can see same Arrays after changing elements:");

        ChangeArray<Object> changeArray = new ChangeArray<>();

        System.out.println(Arrays.toString(changeArray.changeElements(arrayString, 1, 0)));


        System.out.println(Arrays.toString(changeArray.changeElements(arrayInteger, 2, 1)));

        System.out.println("_____________________________________________________________");
        System.out.println("Congratulations! Task is completed - method for changing Arrays' elements works correctly)))");
        System.out.println("_____________________________________________________________");

    }
}
