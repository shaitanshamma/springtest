package lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Patient {
    public Patient(Desease desease) {
        this.desease = desease;
    }
    Desease desease;
//    @Autowired
//    @Qualifier("1")
//    public void setDesease(Desease desease) {
//        this.desease = desease;
//    }
}
