package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public enum MusicType {
    @Qualifier("rock") ROCK, @Qualifier("classical") CLASSICAL, @Qualifier("rap") RAP,
}
