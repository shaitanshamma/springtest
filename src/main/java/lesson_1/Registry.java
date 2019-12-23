package lesson_1;

import lesson_1.spesialists.Medical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry {
    private Medical medical;

    @Autowired(required = false)
    @Qualifier("Oculist")
    public void setRefferal(Medical medical) {
        this.medical = medical;
    }

    public void issueDirection() {
        System.out.println("Направление выдано");
        medical.direct();
    }
}
