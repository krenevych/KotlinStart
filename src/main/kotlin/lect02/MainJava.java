package lect02;

public class MainJava {

    public static void fun(){
        int n = 12;
        int k = 15;
        String s = "Hello";

        fun2();

        double d = 144.0;
    }

    public static void fun2(){
        double d = 12.0;
    }

//    public static void main(String[] args) {
//        int n = 122;
//        String s = "Hello0";
//        String s1 = "Hello0";
//
//        String s2 = "Hello";
//        int n0 = 0;
//        String s3 = s2 + n0;
//
//        StringBuffer stringBuffer = new StringBuffer();
//
//
////        if (s == s3){
//        if (s.equals(s3)){
//            System.out.println("Юху!");
//        } else {
//            System.out.println("no Юху!");
//        }
//
//        int length = s.length();
//
//        fun();
//    }

    public static void main(String[] args) {
        PersonJava person1 = new PersonJava();
        System.out.println(person1);
        person1.setName("Andrii");
        person1.setLastName("Krenevych");
        person1.setAge(21);
        System.out.println(person1);

        PersonJava person2 = new PersonJava("Ivan", "Ivanenko", 23);
        System.out.println(person2);
    }

}
