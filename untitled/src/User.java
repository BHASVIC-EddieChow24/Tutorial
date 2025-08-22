import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Period;

public class User {
    private String name;
    private LocalDate birthDay;
    public Arraylist<Book> books = new ArrayList<Book>();

    User(String name, String birthDay) {
        this.name = name;

        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName(){
        return this.name;
    }

    public String getBirthDay(){
        return this.birthDay.toString();
    }
}
