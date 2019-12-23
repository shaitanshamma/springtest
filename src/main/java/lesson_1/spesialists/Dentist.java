package lesson_1.spesialists;

import org.springframework.stereotype.Component;

//@Component("Medical")
@Component("Dentist")
public class Dentist implements Medical {
    public void direct() {
        System.out.println("Направление к стоматологу выдано!");
    }
}
