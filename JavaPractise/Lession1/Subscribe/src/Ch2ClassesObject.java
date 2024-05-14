import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Ch2ClassesObject {
    String name;
    int age;

    public Ch2ClassesObject(String name, int age) {
        this.name = name;
        this.age = age;

    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Ch2ClassesObject{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", age=").append(age);
//        sb.append('}');
//        return sb.toString();
//    }


    @Override
    public String toString() {
        return "Ch2ClassesObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Welcome to challenge");
        Ch2ClassesObject obj = new Ch2ClassesObject("Zohaib",35);
        System.out.printf("Print Student Info %s : ", obj);
        System.out.println();
        //challenge71
//        obj.concatConvertUppercase();
        //challenge 72
//        obj.findAreaCircle();
        //challenge 73
//        obj.simulateDiceRoll();
        //challenge 75
        obj.concatArrayUsingStringBuilder();

    }

    private void concatArrayUsingStringBuilder() {
        String []arr = new String[]{"Hello ","My ","Name ","Zohaib"};

        StringBuilder finalStr= new StringBuilder();
        for (String str : arr){
            finalStr.append(str);
        }

        System.out.printf("Final String %s", finalStr.toString());


    }

    private void simulateDiceRoll() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please press 0 to throw the dice");
        int start = input.nextInt();
        if(start == 0){
            int v = (int) Math.round(Math.random() * 6);
            System.out.printf("Using Math.Random Dice rolled is %s",v);
            Random rand = new Random();
            int i = rand.nextInt(6) + 1;
            System.out.println();
            System.out.printf("Using Random class %s",i);

        }
    }

    private void findAreaCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle ");
        double radius = input.nextLong();
        System.out.printf("Area : %f",Math.PI*radius*radius);
    }

    private void concatConvertUppercase() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter str1 : ");
        String str1 = input.next();
        System.out.print("Enter str2 : ");
        String str2 = input.next();

        StringBuilder str3 = new StringBuilder();
        str3.append(str1);
        str3.append(" ");
        str3.append(str2);

        String newStr = str3.toString();

        System.out.printf("Final String %S",newStr);


    }
}
