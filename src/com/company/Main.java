package com.company;

public class Main {

        static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("Size of array is invalid");
        }
    }
    static class MyArrayDataException extends Exception {
        public MyArrayDataException(int i, int j){
            super("There is incorrect input in the cell number: "+i+" "+j);
        }
    }

    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        boolean result = false;
        if (array.length!=4) {
            result = true;
        }
        for (String[] i: array) {
            if (i.length!=4) {
                result = true;
            }
        }
        if (result) {
            throw new MyArraySizeException();
        }
    }

    public static void arraySumm(String[][] array) throws MyArrayDataException {
        int res = 0;
        Integer value;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                try {
                    value = Integer.parseInt(array[i][j]);
                }
                catch (Exception e) {
                    System.out.println("Wrong input "+"\""+array[i][j]+"\" in the cell number: : "+i+" "+j);
                    throw new MyArrayDataException(i,j);
                }
                res+=value;
            }
        }
        System.out.println("Total summ of array's elements is = "+res);
    }

    public static void main(String[] args) {
        String[][] arrayIncorrectData = {{"10","80","30","8"},{"99","2","14","7"},{"1","(*_*)","5","17"},{"99","198","86","88"}};
        String[][] arrayWrongSize = {{"10","9","8","7","200"},{"6","5","4","3"},{"2","1","0","3"},{"60","70","80","90"}};
        String[][] arrayCorrect= {{"10","12","30","8"},{"99","2","14","7"},{"1","3","5","17"},{"99","198","86","88"}};
        try {
            checkArraySize(arrayIncorrectData);
        }
        catch (MyArraySizeException e) {
            System.out.println(e);
        }

        try {
            checkArraySize(arrayWrongSize);
        }
        catch (MyArraySizeException e) {
            System.out.println(e);
        }
        try {
            arraySumm(arrayIncorrectData);
        }
        catch (MyArrayDataException e) {
            System.out.println(e);

        }

    }
}
