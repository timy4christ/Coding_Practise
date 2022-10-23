class Batsman {
    int totRuns;
    int totMatches;
    double avg;

    static {
        System.out.println("Hi, OuterClass Static");
    }

    {
        System.out.println("Hi, OuterClass Non-static");
    }

    Batsman() {
        System.out.println("OuterClass COnstructor");
    }

    Batsman(int totRuns, int totMatches) {
        System.out.println("OuterClass COnstructor");
        this.totRuns = totRuns;
        this.totMatches = totMatches;
    }

    void printAvg() {
        AvgCalculator avgCal = new AvgCalculator();
        double res = avgCal.calAverage();
        System.out.println("Batsman Average: " + res);
        // System.out.println("Batsman Print");
    }

    class AvgCalculator {

        {
            System.out.println("Hi, InnerClass Non-static");
        }
        double avg;

        AvgCalculator() {
            System.out.println("InnerClass COnstructor");
        }

        double calAverage() {
            avg = (double) totRuns / totMatches;
            return avg;
        }

        void printAvg() {
            AvgCalculator avgCal = new AvgCalculator();
            double res = avgCal.calAverage();
            System.out.println("Batsman Average: " + res);
            System.out.println("AvgCalculator Print");
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Batsman b = new Batsman(78, 65);
        b.printAvg();

        Batsman b2 = new Batsman(45, 20);
        Batsman.AvgCalculator avg = b2.new AvgCalculator();
        avg.printAvg();
    }
}