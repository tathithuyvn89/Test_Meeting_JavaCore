package com.veho.service;

import java.util.List;

public interface CrudGenericService <T>{

    List<T> listAll();

    T findById(String id);

    T saveModel(T model);

    T updateModel(String id, T model);

    T deleteModel(String id);
}
