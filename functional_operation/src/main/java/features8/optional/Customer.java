package features8.optional;
import lombok.*;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

}


