
class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Fourth obj = new Fourth();
        System.out.println("Belonging to First Class obj.first= " + obj.first);
        System.out.println("Belonging to Second Class obj.second= " + obj.second);
        System.out.println("Belonging to Third Class obj.third= " + obj.third);
        System.out.println("Belonging to Fourth Class obj.fourth= " + obj.fourth);
    }
}

class First {
    int first=1;
}

class Second extends First {
    int second=2;
}

class Third extends Second {
    int third=3;
}

class Fourth extends Third {
    int fourth=4;
}
