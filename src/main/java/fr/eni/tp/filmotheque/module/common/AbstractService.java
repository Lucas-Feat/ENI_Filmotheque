package fr.eni.tp.filmotheque.module.common;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AbstractService<T> {

    public Optional<T> findById(final Long id);

    public T create(final T object);

    public Optional<T> findOne(final Predicate predicate);

    public T update(final T object, final Long id);

    public T patch(final T object, final Long id);

    public void delete(final Long id);

    public List<T> findAll(final Predicate predicate);
}