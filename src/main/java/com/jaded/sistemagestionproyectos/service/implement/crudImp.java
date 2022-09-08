package com.jaded.sistemagestionproyectos.service.implement;

import com.jaded.sistemagestionproyectos.repository.Igeneric;
import com.jaded.sistemagestionproyectos.service.Icrud;

import java.util.List;

public abstract class crudImp<T, ID> implements Icrud<T, ID> {
    protected abstract Igeneric<T,ID> getRepo();

    @Override
    public T create (T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public T update(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public List<T> readAll() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T readById(ID id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) throws Exception {
        getRepo().deleteById(id);
    }
}
