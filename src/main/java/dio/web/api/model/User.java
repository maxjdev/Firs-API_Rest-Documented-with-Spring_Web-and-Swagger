package dio.web.api.model;

import lombok.*;

@Getter @Setter @NoArgsConstructor @ToString
public class User {
    private Integer id;
    private String login;
    private String password;
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }
}
