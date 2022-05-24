package HW7_1;

import HW7_1.Manager;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ZavodUtils {

    public static @NotNull Object searchByName(Employee[] employeeArr, String nameToSearch) {
        for (Employee employee : employeeArr) {
            if (employee.getName().equals(nameToSearch)) return employee;
        }
        return "Not found.";
    }

    public static Object searchBySubstring(Employee[] employeeArr, String substringToSearch) {
        for (Employee employee : employeeArr) {
            if (employee.getName().contains(substringToSearch)) return employee;
        }
        return "Not found.";
    }

    public static double countSalaryBudget(Employee[] employeeArr) {
        return Arrays.stream(employeeArr).mapToDouble(Employee::getSalary).sum();
    }

    public static double getMinSalary(Employee[] employeeArr) {
        return Arrays.stream(employeeArr).mapToDouble(Employee::getSalary).min().orElse(Double.MAX_VALUE);
    }

    public static double getMaxSalary(Employee[] employeeArr) {
        return Arrays.stream(employeeArr).mapToDouble(Employee::getSalary).max().orElse(Double.MIN_VALUE);
    }

    public static int getMinNumberOfSubordinates(Manager[] managers) {
        return Arrays.stream(managers).mapToInt(Manager::getNumberOfSubordinates).min().orElse(Integer.MAX_VALUE);
    }

    public static int getMaxNumberOfSubordinates(Manager[] managers) {
        return Arrays.stream(managers).mapToInt(Manager::getNumberOfSubordinates).max().orElse(Integer.MIN_VALUE);
    }

    public static double getMinSalaryDiff(Manager @NotNull [] managers) {
        double min = Double.MAX_VALUE;
        for (Manager manager : managers) {
            if (min > (manager.getSalary() - Manager.getBaseSalary())) {
                min = manager.getSalary() - Manager.getBaseSalary();
            }
        }
        return min;
    }

    public static double getMaxSalaryDiff(Manager @NotNull [] managers) {
        double max = Double.MIN_VALUE;
        for (Manager manager : managers) {
            if (max < (manager.getSalary() - Manager.getBaseSalary())) {
                max = manager.getSalary() - Manager.getBaseSalary();
            }
        }
        return max;
    }
}
