package music;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;



//по умолчанию будет id = "classicalMusic"
//@Component - помечает как класс в котором нужно создать Bean этого класса и его будем забирать из ApplicationContext
//можно самому пометить каким нужно задать id для этого класса
@Component("classical")
public class ClassicalMusic implements Music {

    private final List<String> classicalMusics = new ArrayList<>();
    @Override
    public String getSong() {
        Random random = new Random(classicalMusics.size());
        classicalMusics.add("Beethoven Symphony No. 5");
        classicalMusics.add("Beethoven Piano Sonata No. 14");
        classicalMusics.add("Beethoven Piano Sonata No. 8");
        return random.toString();
    }
}
