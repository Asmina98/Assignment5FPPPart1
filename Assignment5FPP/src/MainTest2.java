

import java.util.Scanner;


public class MainTest2 {


    public static void main(String[] args) {

        DeptEmployee[] employees = new DeptEmployee[]{
                new Professor("James", 110000, 2016, 7, 2, 5),
                new Secretary("Britney", 20000, 2015, 3, 9, 25),
                new Professor("MIchael", 200000, 2012, 9, 19, 3),
                new Secretary("Daina", 10000, 2029, 6, 29, 20),
                new Professor("Alex", 200000, 2018, 8, 1, 4)
        };
        sumOfAllSalaries(employees);
    }
    public static void sumOfAllSalaries(DeptEmployee[] employees) {

        Scanner sc = new Scanner(System.in);
        System.out.println("To see sum of Salaries press( Y for yes and N for no) : ");
        String yesOrNo = sc.nextLine().toUpperCase();

        if (yesOrNo.equals("Y")) {
            int sum = 0;
            for (DeptEmployee a : employees) {
                sum += a.computeSalary();
            }
            System.out.println("The sum of all salaries is : " + sum);
        } else if (yesOrNo.equals("N")) {
            System.out.println("OK!");
        } else {
            System.out.println("Please Enter Y for Yes and N for No....");
        }
        sc.close();
    }
}
