import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employees {
    public static void main(String[] args) {
        List<Database> db = new ArrayList<>();
        db.add(new Database(101, "Raju", 50.000, "DEV"));
        db.add(new Database(102, "Ramu", 20.000, "TESTING"));
        db.add(new Database(103, "Chandu", 30.000, "CLOUD"));
        db.add(new Database(104, "Rani", 40.000, "DEV"));

//
        List<Database> filteredDb = db.stream()
                .filter(d -> d.getSalary() >= 25000 && d.getDept().equals("DEV"))
                .collect(Collectors.toList());
        filteredDb.forEach(data -> System.out.println(data));

    }
}
