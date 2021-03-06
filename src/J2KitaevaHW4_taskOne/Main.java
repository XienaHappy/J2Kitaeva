package J2KitaevaHW4_taskOne;

import java.util.*;

    public class Main {

        public static int arrayStringSize = 100;
        public static String[] arrayString = new String[arrayStringSize];
        public static List<String> stringArrayList = Arrays.asList(arrayString);

        public static void main(String[] args) {
            createStringArray();

            System.out.println("List size=  " + stringArrayList.size());
            HashSet<String> targetSet = new HashSet<String>(stringArrayList);
            System.out.println("Set size=  " + targetSet.size());

            HashMap<String,Integer> result = new HashMap<>();
            for(String str: targetSet){
                result.put(str,count(str));
            }

            System.out.println(result);
        }

        public static void createStringArray(){
            Random random = new Random();
            for(int i = 0; i<arrayStringSize;i++){
                arrayString[i] = String.valueOf(random.nextInt(50));
            }

        }

        public static Integer count(String str){
            Integer result = 0;
            for(String strThis : stringArrayList){
                if(strThis.equals(str)) result++;
            }
            return result;
        }

    }

