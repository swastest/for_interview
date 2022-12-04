public class C1_Equals {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println();

        String s1 = new String("42");
        String s2 = new String("42");
        String s3 = String.valueOf(42);
        String s4 = "42";
        String s5 = "4" + "2";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println();

        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println();

        Integer i1 = 42;
        Integer i2 = 42;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println();

        Integer i3 = new Integer(42);
        Integer i4 = new Integer(42);

        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
    }
}
