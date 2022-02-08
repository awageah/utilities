import utils.CollectionsUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Utilities {

    public static void main(String[] args) {

        /*
         *   Filtering list of objects
         * */
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100, "ayman"));
        employeeList.add(new Employee(101, "khalid"));

        System.out.println("All Employees: " +
                employeeList);
        
        System.out.println("Filtered Employees: " +
                CollectionsUtils.filter(employeeList, emp -> emp.getId() >= 101));

    }

    public static class Employee {

        private Integer id;
        private String name;

        public Employee() {

        }

        public Employee(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Employee employee = (Employee) o;
//            return Objects.equals(id, employee.id);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(id);
//        }

        @Override
        public boolean equals(Object o) {
            if (o == null || !(o instanceof Employee)) {
                return false;
            }
            Employee employee = (Employee) o;
            return this.id.equals(employee.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
