package fr.eni.tp.filmotheque.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private Long id;
    private String name;
    private String firstName;
    private String email;
    private String password;
    private Boolean isAdmin;

}
