package trash;

public record EmployeeRecord (String name, int employeeNumber) implements CanSwim {

    @Override
    public void swim() {

    }
}



//    public EmployeeRecord {
//        if (employeeNumber < 0){
//            throw new IllegalArgumentException("employee cannot have negative num");
//        }
//    }
//
//
//}
