package bd.edu.seu.nosqldemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class AppUser {
    @Id
    private int userId;
    private String name;
    private String email;
    private String phone;
}
