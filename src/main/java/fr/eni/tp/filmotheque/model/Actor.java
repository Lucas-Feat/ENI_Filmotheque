package fr.eni.tp.filmotheque.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Actor extends MovieMember {

    @Override
    public String toString() {
        return super.toString();
    }
}
