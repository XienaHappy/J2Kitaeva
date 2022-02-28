package J2KitaevaHW4_taskTwo;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+79211234123","Smith");
        phoneBook.add("+79211234124","Tomson");
        phoneBook.add("+79211234125","Anderson");
        phoneBook.add("+79211234126","Brown");
        phoneBook.add("+79211234127","James");
        phoneBook.add("+79211234128","Emerald");
        phoneBook.add("+79211234129","Simpson");

        System.out.println(phoneBook.getPhoneByFIO("Brown"));
        System.out.println(phoneBook.getPhoneByFIO("+79211234123"));
    }
}

