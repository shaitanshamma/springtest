package lesson_1.spesialists;

import org.springframework.stereotype.Component;

//@Component("Medical")
@Component("Therapist")
public class Therapist implements Medical {
    public void direct() {
        System.out.println("Направление к терапевту выдано!");
    }
}
