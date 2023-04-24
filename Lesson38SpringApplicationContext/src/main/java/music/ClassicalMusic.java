package music;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



//по умолчанию будет id = "classicalMusic"
//@Component - помечает как класс в котором нужно создать Bean этого класса и его будем забирать из ApplicationContext
//можно самому пометить каким нужно задать id для этого класса

public class ClassicalMusic implements Music {

    private String config;

    ClassicalMusic() {
    }

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
    //при singleton создается только 1 bean объекта фабричным методом

    @Override
    public String getSong() {

        return "Beethoven symphony";
    }
//init, destroy почти всегда будут void, и методы не должны иметь аргументы

    @PostConstruct
    private void doMyInit() {
        config = "doing my initialization";
    }

    @PreDestroy
    private void doMyDestroy() {
        config = "destroying my bean";
    }

}
