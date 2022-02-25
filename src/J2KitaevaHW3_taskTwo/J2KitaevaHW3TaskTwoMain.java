package J2KitaevaHW3_taskTwo;

public class J2KitaevaHW3TaskTwoMain {

        public static void main(String[] args) {

            System.out.println("_____________________________________________________________");
            System.out.println("Hello! Following is the task #2, Homework 3:");
            System.out.println("_____________________________________________________________");
            Orange[] oranges = new Orange[5];

            Orange orange0 = new Orange(300);
            Orange orange1 = new Orange(200);
            Orange orange2 = new Orange(350);
            Orange orange3 = new Orange(500);
            Orange orange4 = new Orange(450);

            oranges[0] = orange0;

            oranges[1] = orange1;

            oranges[2] = orange2;

            oranges[3] = orange3;

            oranges[4] = orange4;

            Box<Orange> box1 = new Box<>(oranges);

            Orange[] oranges2 = new Orange[5];

            Orange orange = new Orange(300);
            oranges2[4] = orange4;
            Box<Orange> box2 = new Box<>(oranges2);
            System.out.println(box1.getTotalWeightArray()+ " kg is total weight of the container (box) #1 with oranges.");
            System.out.println(box2.getTotalWeightArray()+ " kg is total weight of the container (box) #2 with apples.");

            System.out.println(box1.compare(box2));


            box1.toEmptyArray(box2);

            System.out.println(box2);

            Apple[] apples = new Apple[5];

            Apple apple0 = new Apple(200);
            Apple apple1 = new Apple(250);
            Apple apple2 = new Apple(300);
            Apple apple3 = new Apple(220);
            Apple apple4 = new Apple(500);

            apples[0] = apple0;

            apples[1] = apple1;

            apples[2] = apple2;

            apples[3] = apple3;

            apples[4] = apple4;

            Box<Apple> box3 = new Box<>(apples);

        }

    }

