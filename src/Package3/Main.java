package Package3;

import Package2.Employee;
import Package2.FullTimeEmployee;
import Package2.Intern;
import Package2.PartTimeEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Employee[] emp = {new FullTimeEmployee("Laura", 1, 500000),
                new PartTimeEmployee("Knarik", 2, 1500, 12),
                new Intern("Aren", 3, 150000)
        };

        for (Employee e : emp){
            System.out.println(e.getDetails());
            System.out.println(e.calculateSalary());
        }
    }
}