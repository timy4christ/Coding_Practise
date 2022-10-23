public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sc1 = new StringBuffer("Welcome");
        System.out.println("Before append==> sc1 : " + (sc1));
        StringBuffer sc2 = sc1.append(",Timy");
        System.out.println("After append==> sc1 : " + (sc1));
        System.out.println("sc2 : " + (sc2));
        System.out.println("sc1 == sc2: " + (sc1 == sc2));
    }
}
