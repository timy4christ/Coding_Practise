class CricketerDemo {

    public static void main(String[] args) {

        Cricketer c1 = new Cricketer();
        System.out.println("=================Cricketer===================");
        c1.setDetails("Sachin", "India", 1800);
        c1.printDetails();

        System.out.println("=================Batsman===================");
        Batsman bats1 = new Batsman();
        bats1.setDetails("Rishab Pant", "India", 120); // from child object call parent method
        bats1.setTotRuns(15000);
        bats1.printDetails(); // calls method of class Batsman

        System.out.println("=================Bowler===================");
        Bowler bow1 = new Bowler();
        bow1.setDetails("Bumra", "India", 500);
        bow1.setTotWickets(89);
        bow1.printDetails(); // child object calls parent method
        bow1.printTotWickets();

    }

}

class Cricketer {

    String name;
    String country;
    int totMatches;

    void setDetails(String name, String country, int totMatches) {
        this.name = name;
        this.country = country;
        this.totMatches = totMatches;
    }

    void printDetails() {
        System.out.println(name);
        System.out.println(country);
        System.out.println(totMatches);
    }

}

class Batsman extends Cricketer {
    int totRuns;

    void setTotRuns(int totRuns) {
        this.totRuns = totRuns;
    }

    void printDetails() {
        super.printDetails();
        System.out.println(totRuns);
    }
}

class Bowler extends Cricketer {
    int totWickets;

    void setTotWickets(int totWickets) {
        this.totWickets = totWickets;
    }

    void printTotWickets() {
        System.out.println(totWickets);
    }
}
