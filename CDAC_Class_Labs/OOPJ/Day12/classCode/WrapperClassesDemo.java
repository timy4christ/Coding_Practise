public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Double dobj = new Double(75.65f);
        Double dobj1 = 53.65;
        Double dobj2 = Double.valueOf(53.65);
        // Double dobj2 = Double.valueOf("53.65");
        // double dp = Double.parseDouble("35.69"); 
        // int ip = Integer.parseInt("59");
        // String s = dobj1.toString();
        //int res = dobj1.compareTo(dobj2); //1 (dobj1 is greater than dobj2)
        int res = dobj2.compareTo(dobj1); // -1
        System.out.println(res);
        System.out.println(dobj1.hashCode() + "    " + dobj2.hashCode()); // calls implicitally overridden hashCode() method
        System.out.println(dobj1.equals(dobj2));
        System.out.println(dobj1); // calls implicitally overridden toString
    }
}
