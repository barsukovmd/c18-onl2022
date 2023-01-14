package homework.task6;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailAddress {
    private String email;
    private String additionalInfo;

    public EmailAddress(String email) {
        this.email = email;
    }
}
