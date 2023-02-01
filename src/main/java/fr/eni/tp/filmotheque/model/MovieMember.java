package fr.eni.tp.filmotheque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieMember {
    private Long id;
    private String name;
    private String firstName;

    public String toString() {
        return getFirstName() + " " + getName() + " (" + getId() + ")";
    }
}
