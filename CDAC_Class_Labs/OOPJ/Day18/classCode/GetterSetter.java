class Employee {
    int empId;
    String name;

    Employee() {
    }

    void setEmpId(int empId) {
        this.empId = empId;
    }

    int getEmpId() {
        return this.empId;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

class GetterSetter {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(4);
        emp.setName("Timy");
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());

    }
}