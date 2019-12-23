package lesson_1.spesialists;


import org.springframework.stereotype.Component;

//@Component("Medical")
@Component("Oculist")
public class Oculist implements Medical {
    public void direct() {
        System.out.println("Направление к окулисту выдано!");
    }
}
