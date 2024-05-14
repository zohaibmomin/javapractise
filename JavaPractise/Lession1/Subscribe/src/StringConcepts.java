public class StringConcepts {
    String fname;
    String mname;
    String lname;
    int age;
    int height;

    //Normal Concat string
//    @Override
//    public String toString() {
//        return "StringConcepts{" +
//                "fname='" + fname + '\'' +
//                ", mname='" + mname + '\'' +
//                ", lname='" + lname + '\'' +
//                ", age=" + age +
//                ", height=" + height +
//                '}';

    //With string buffer
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StringConcepts{");
        sb.append("fname='").append(fname).append('\'');
        sb.append(", mname='").append(mname).append('\'');
        sb.append(", lname='").append(lname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
//    }

    public static void main(String[] args) {
        System.out.println("Welcome to String concepts");
        StringConcepts sc = new StringConcepts();
        System.out.println(sc);
        //prints  StringConcepts@a09ee92 ie Classname+Address
        //if ToString used then StringConcepts{fname='null', mname='null', lname='null', age=0, height=0}
        // Use Stringbuffer to generate Override toString()
        sc.age=9999999;
        //Concatenation is a heavy operation. for each concatenation it creates space in memory and hence not recommended
        System.out.printf("Hello %s , How are you. Your age is %,15d : ", sc.fname , sc.age);

        //String builder example
        // String buffer creates mutable String objects in Heap
        StringBuilder str = new StringBuilder("Hello");
        str.append(1);
        System.out.printf("\nStringBuilder %s ",str);
    }
}
