package fr.eni.tp.filmotheque.module.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EntityNotFoundException extends RuntimeException {
    @Getter
    private final Class<?> entity;
}
