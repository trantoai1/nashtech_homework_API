package com.toaitran.homework.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
    List<T> findAll();

    Optional<T> findById(ID id);

    void update(T t);

    void insert(T t);

    void save(T t);

    void delete(T t);
}
