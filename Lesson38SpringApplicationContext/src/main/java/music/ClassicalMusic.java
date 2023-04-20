package music;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
