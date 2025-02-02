package Ex_Task_Feb;

public class Task_2_Feb_String_Functions {
    public static void main(String[] args) {
        String str1 = "Hello";//creates or reuses "Hello" in the string pool
        String str2 = "Hello"; // reuses hello from the pool- and no new String will be created for str2 as its same as str1 content
        String str3 = new String("Hello");// This Creates a new Object - here str 3 is a reference and new String("hello ") is an object

        System.out.println( str1 == str2);// true - Bcz reference /location/variable address is same as it is same and == is used for location and not content
        System.out.println(str1 == str3); // false - though hello content is same but reference is difference
        System.out.println(str1.equals(str3));// true - as the content are same



        // Practise all the function

        String name1= "Veda";
        String name2= "vathi";

        //1.chatAt()- length starts from 1 v-1 e-2 d-3 a-4 where as charAt starts from 0 v-0, e-1, d-2, a-3
        System.out.println(name1.charAt(2));//d- as atname1 we have d - if we give 4 or more - it throws java out of bound exception

        //2 concat()
        System.out.println(name1.concat(name2));//Vedavathi
        System.out.println(name1.concat("Rangaswamy"));//VedaRangaswamy

        //3 contains()
        System.out.println(name1.contains("ed")); //true as name1 contain ed in it
        System.out.println(name1.contains("ED"));// false - case sensitive

        //4 equals()

        System.out.println(name1.equals("Veda"));//true as the content are same
        System.out.println(name1.equals(name2));//false as veda and Vathi content are differentr
        System.out.println(name1.equals("veda"));//false - case sensitive

        //5 equalsIgnoreCase()
        System.out.println(name1.equalsIgnoreCase("veda"));//true - case sensitive

        //6 indexOf()
        System.out.println(name1.indexOf("e")); //v-0, e-1, d-2, a-3

        //7 length()
        System.out.println(name1.length());//4 - veda-4

        //8 replace(,)
        System.out.println(name1.replace('d','D')); //veDa

        //9 split
        String email ="vedavathi@gmail.com@hotmail.com";
        String[] split = email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        //10 substring()
        System.out.println(name1.substring(1,3)); //ed - In Substring though a-3 (veda) it prints d as it always goes -1
        System.out.println(name1.substring(1));//eda - it prints all from that index

        //11 toLoweCase()
        System.out.println(name1.toLowerCase());//veda

        //12 toUpperCase()
        System.out.println("Rangaswamy".toUpperCase());//RANAGASWAMY

        //13 replaceAll ()
        System.out.println("replaceAll".replaceAll("l","eee"));
        System.out.println(name1.replaceAll("a","ha"));//Vedha

        //14 startWith()
        System.out.println(name1.startsWith("e"));//false - as it starts with V

        //15 endsWith ()
        System.out.println(name1.endsWith("a")); //true

        //16 isEmpty()
        String name4 = "";
        System.out.println(name1.isEmpty());//fase
        System.out.println(name4.isEmpty());//true

        //17 trim()
        String name5 = "       Hello         Veda!!!!!!!   !!!!!!          ";
        System.out.println(name5.trim()); //Hello         Veda!!!!!!!   !!!!!! it removes only front and Bacl space and not middle Space

        //18 compareTo()
        System.out.println(name1.compareTo("Veda"));
        System.out.println(name1.compareTo("veda"));

        //19 compareToIgnoreCase()
        System.out.println(name1.compareToIgnoreCase("veda"));

        //20 lastIndexOf()
        System.out.println(name1.lastIndexOf('a')); //3 - v-0, e-1, d-2, a-3
        System.out.println("veadada".lastIndexOf('a'));//6- last one

        //21 repeat()
        System.out.println(name1.repeat(3));//VedaVedaVeda

        //22 StringBuilder()
        StringBuilder sb = new StringBuilder("Learning");
        sb.append("automation");
        System.out.println(sb);




    }
}
