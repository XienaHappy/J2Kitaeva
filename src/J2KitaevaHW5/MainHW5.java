package J2KitaevaHW5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainHW5 {
    public static ArrayList<HW5FileObject> hw5fileObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "src/J2KitaevaHW5/KitaevaJavaHW5.csv";
    public static final String title = "Cats"+ ";" + "Dogs"
            + ";" + "Flowers" + ";"+ System.getProperty(" ");

    public static void main(String[] args) throws IOException {
        createHW5FileObjects();
        writeStream();

        AppData appData = readToObject();
    }

    public static void createHW5FileObjects(){
        Random random = new Random();

        for(int i=1;i<999;i++){
            hw5fileObjectArrayList.add( new HW5FileObject(i, random.nextInt(900), random.nextInt(999)));
        }
    }


    public static void writeStream() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)){
            for(byte b :title.getBytes(StandardCharsets.UTF_8)){
                fileOutputStream.write(b);
            }
            for(HW5FileObject hw5FileObject : hw5fileObjectArrayList){
                String raw = hw5FileObject.getValue() + ";" + hw5FileObject.getValueFrom()
                        + ";" + hw5FileObject.getValueTo() + ";"+ System.getProperty("line.separator");
                for(byte b :raw.getBytes(StandardCharsets.UTF_8)){
                    fileOutputStream.write(b);
                }
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }

}
