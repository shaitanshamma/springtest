package lesson_1;

import org.springframework.stereotype.Component;

//@Component
public class Desease {
    private String name;
    public Desease(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
