package classes;

interface DBDriver {
    public abstract void createConnection();
}

class OracleDBDriver implements DBDriver{
    public void createConnection(){
        System.out.println("Created connection by OracleDBDriver");
    }
}

class InterfaceDemo{
    public static void main(String[] args) {
        
        OracleDBDriver oracDriver = new OracleDBDriver();
        oracDriver.createConnection();

        DBDriver dbDriver = new OracleDBDriver();
        dbDriver.createConnection();
    }
}