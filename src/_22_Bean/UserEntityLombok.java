package _22_Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntityLombok {
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDate createDt;
    private LocalDate updateDt;
}
