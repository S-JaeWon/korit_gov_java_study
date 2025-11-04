package _32_LayeredArchitecture2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SigninReqDto {
    private String username;
    private String password;
}
