package music;


import org.springframework.stereotype.Component;


@Component("classic")
//по умолчанию будет id = "classicalMusic"
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
