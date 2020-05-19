package lt.vu.rest.contracts;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthorDto {
    private String firstName;
    private String lastName;
    private String personalCode;
}
