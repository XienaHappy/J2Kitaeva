package J2KitaevaHW4_taskTwo;

import java.util.HashMap;

public class PhoneBook {

    private HashMap<String,String> stringStringHashMap = new HashMap<>();

    public void add(String phone, String surname){
        stringStringHashMap.put(phone,surname);
    }

    public String getPhoneByFIO(String surname){
        if(stringStringHashMap.containsValue(surname)){
            String result = "The same phone numbers: ";
            for(String key: stringStringHashMap.keySet()){
                if(stringStringHashMap.get(key).equals(surname)) result += key + "; ";
            }
            return result;
        } else return "This number can not be found.";


    }
}

