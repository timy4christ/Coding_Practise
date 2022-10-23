class WrapperClassDemo {
    public static void main(String args[]) {
        // Boolean bobj = new Boolean("true");;
        // Boolean bobj = Boolean.valueOf(true);
        // System.out.println(bobj);

        Character cobj = new Character('A');
        // System.out.println((Character.isLetterOrDigit(cobj)));

        String binCharRes = Integer.toBinaryString(cobj);
        String binRes = Integer.toBinaryString(31);
        String hexRes = Integer.toHexString(31);
        String octRes = Integer.toOctalString(31);
        System.out.println(binCharRes); // 1000001
        System.out.println(binRes); // 11111
        System.out.println(hexRes); // 1f
        System.out.println(octRes); // 37

        Integer iobj1 = 300; // autoboxing
        Integer iobj2 = 600; // autoboxing
        Character cobj1 = 'a';
        Short sobj = 35;
        Float fobj = 45.65f;
        int i = iobj1; // autounboxing
        int i2 = cobj1; // autounboxing
        int i3 = sobj; // autounboxing
        // int i4 = fobj; // not compatible

        System.out.println((fobj.getClass())); // class java.lang.Float
        System.out.println(i3); // 35
        
        
        System.out.println(iobj1 + iobj2); // 900
        System.out.println(++iobj1); //301
        System.out.println(1.35 + iobj1); //302.35


        


    }
}