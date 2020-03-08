package practice;

import java.util.Arrays;

public class AccessClassDetails {

    private String name;
    private String rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {
        AccessClassDetails acd = new AccessClassDetails();
        Class aClass = acd.getClass();

        System.out.println("Methods of " + acd.getClass().getSimpleName() + " are : " + Arrays.toString(aClass.getDeclaredMethods()));
        System.out.println("Member variables of " + acd.getClass().getSimpleName() + " are : " + Arrays.toString(aClass.getDeclaredFields()));

        //For every loaded .class file, only one Object of class is created
        Class aClass2 = acd.getClass();
        System.out.println("aClass == aClass2 : "  + (aClass == aClass2));

    }
}
