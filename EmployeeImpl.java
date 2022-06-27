
public class EmployeeImpl {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager manager = new Manager();

        manager.setEmployeeName("Jane");
        manager.setDob("03/03/1999");
        manager.setEmployeeCode("e00123");
        manager.setSalary(3000);

        manager.setTeamSize(3);
        manager.setTeamRatings(2);

        System.out.println("The Employee Name   is : " + manager.getEmployeeName());
        System.out.println("The Employee Code   is : " + manager.getEmployeeCode());
        System.out.println("The Employee DOB    is : " + manager.getDob());
        System.out.println("The Employee Age    is : " + manager.getAge());
        System.out.println("The Employee Salary is : " + manager.getSalary());
        System.out.println("The Employee Team Size is    : " + manager.getTeamSize());
        System.out.println("The Employee Team Ratings is : " + manager.getTeamRatings() + " stars");

    }
}
