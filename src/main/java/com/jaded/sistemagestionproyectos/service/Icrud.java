package com.jaded.sistemagestionproyectos.service;

import java.util.List;

public interface Icrud<T,ID> {
    T create(T t) throws Exception;
    T update(T t) throws Exception;
    List<T> readAll() throws Exception;
    T readById(ID id) throws Exception;
    void delete(ID id) throws Exception;
}
