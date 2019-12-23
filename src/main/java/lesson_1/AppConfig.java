package lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson_1")
public class AppConfig {
//        @Bean(name = "desease")
//        Desease desease(){
//            return desease();
//        }
//    @Bean(name = "patient")
//    public Patient patient(Desease desease){
//        Patient patient = new Patient(desease);
//        return patient;
//    }
}
