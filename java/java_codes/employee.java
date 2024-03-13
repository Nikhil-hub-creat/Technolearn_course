import java.util.*;
public class employee {
    int salary;
    String name;
    int age;
    int empno;

    employee(int empno,String name,int age,int salary){
        this.empno = empno;
        this.name = name;
        this.age= age;
        this.salary=salary;
        setSalary(salary);
    }
    public int getempno(){
        return empno;
    }
    public String getname(){
        return name;
    }
    public int getage()
    {
        return age;
    }
    public int getsalary()
    {
        return salary;
    }

    

    public void setSalary(int salary){
        if(salary>50000){
            // System.out.println("salary high");
            this.salary = salary+10000;
        }else{
             this.salary = salary;
        }
    }
    public String toString(){
        return "Employee Details:"+empno + "\n"+ name+"\n"+age+"\n"+salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee no");
        int no = sc.nextInt();
        System.out.println("Enter employee name");
        String em_name = sc.next();
        System.out.println("Enter employee age");
        int Age = sc.nextInt();
        System.out.println("Enter employee salary");
        int Sal = sc.nextInt();

        employee obj = new employee(no, em_name, Age, Sal);
        System.out.println(obj);
    }
}
