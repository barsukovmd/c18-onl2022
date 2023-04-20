package music;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component("classicalMusic")
//@Component - помечает как класс в котором нужно создать Bean этого класса и его будем забирать из ApplicationContext
//можно самому пометить каким нужно задать id для этого класса
public class ClassicalMusic implements Music {

    private String config;

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {//при singleton создается только 1 bean объекта фабричным методом
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Beethoven symphony";
    }

    private void doMyInit() {
        config = "doing my initialization";
    }

    private void doMyDestroy() {
        config = "destroying my bean";
    }

}
