package nullObject.v1;

public class Database {
    public static IEmployee findEmployeddById(int id) {
        if (id == 1234) {
            return new Employee("John");
        } else {
            return new NullEmployee();
        }
    }
}
