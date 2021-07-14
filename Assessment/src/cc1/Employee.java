package cc1;
public class Employee {
    
    private int employeeId;
    private String employeeName;
    private double salary;
    private int incrementPercentage;

public Employee(int employeeId, String employeeName, double salary){
    this.employeeId=employeeId;
    this.employeeName=employeeName;
    this.salary=salary;
}

public int getEmployeeId(){
    return employeeId;
}

public void setEmployeeId(int employeeId){
    this.employeeId=employeeId;
}

public String getEmployeeName(){
    return employeeName;
}

public void setEmployeeName(String employeeName){
    this.employeeName=employeeName;
}

public double getSalary(){
    return salary;
}

public void setSalary(double salary){
    this.salary=salary;
}

public int getIncrementPercentage(){
    return this.incrementPercentage;
}

public void setIncrementPercentage(int incrementPercentage){
    this.incrementPercentage=incrementPercentage;
}

/*
This method is used to calculate the incremented percentage of the salary of the employees.
If the range of yearsOfExperience is between 1 and 5(both inclusive) then set the incrementPercentage as 15.
If the range of yearsOfExperience is between 6 and 10(both inclusive) then set the incrementPercentage as 30.
If the range of yearsOfExperience is between 11 and 15(both inclusive) then set the incrementPercentage as 45.
*/
public void findIncrementPercentage(int yearsOfExperience){
    
    if (yearsOfExperience >= 1 && yearsOfExperience <= 5 ){
        this.setIncrementPercentage(15);
    } else if(yearsOfExperience >= 6 && yearsOfExperience <= 10){
        this.setIncrementPercentage(30);
    }  else if(yearsOfExperience >= 11 && yearsOfExperience <= 15){
        this.setIncrementPercentage(45);
    }
}
	
public double calculateIncrementSalary(){
    return getSalary()+((getSalary()*getIncrementPercentage())/100);
}
}
