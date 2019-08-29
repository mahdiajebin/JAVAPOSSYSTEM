package cashier.system;

/**
 *
 * @author Jeury
 */
public class Employee {
    private String user = "name";
    private String pswrd = "1234";
    private String empId = "0235";
/*----------------------------------------------------------------------------*/    
    public Employee(){}
    
    public Employee(String value1, String value2){
        this.user = value1;
        this.pswrd = pswrd;
        this.empId = value2;
    }
/*----------------------------------------------------------------------------*/    
    public void setUser(String value){
        this.user = value;
    }
    public String getUser(){
        return this.user;
    }
/*----------------------------------------------------------------------------*/        
    public void setPswrd(String value){
        this.pswrd = value;
    }
    public String getPswrd(){
        return this.pswrd;
    }
/*----------------------------------------------------------------------------*/
    public void setEmpId(String value){
        this.empId = value;
    }
    public String getEmpID(){
        return this.empId;
    }
/*----------------------------------------------------------------------------*/    
    public String toString(){
        return "Welcome, " + this.user; 
    }
    /*----------------------------------------------------------------------------*/
    //EMPLOYEES
    static Employee E1 = new Employee("Jeury", "101");
    static Employee E2 = new Employee("Gary", "102");
    static Employee E3 = new Employee("Mahdia", "103");
    static Employee E4 = new Employee("Ali", "104"); 
}
