public class Devops_Engineer extends Employee {
    double bonus=5000;
    
    public void display_bonus()
    {
        bonus+=salary;
        System.out.println("Updated Salary:"+bonus);
    }
    public static void main(String[] args)
    {
        Devops_Engineer d=new Devops_Engineer();
        System.out.println("Employee Information:");
        d.display();
        d.display_bonus();

    }

}
