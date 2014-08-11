package com.mijao.poc.persistence.cql;

import java.util.List;

public interface CrudPersistence {
    <T> T crudUpdate(Object payload, Class instanceClazz);

    <T> T crudUpdate(Object payload, Class instanceClazz, String tableName);

    <T> T crudRead(String id, Class instanceClazz);

    <T> T crudRead(String id, Class instanceClazz, String tableName);

    void crudDelete(String id, Class instanceClazz);

    void crudDelete(String id, Class instanceClazz, String tableName);

    <T> List<T> crudList(Class instanceClazz);

    <T> List<T> crudList(Class instanceClazz, String tableName);

    <T> List<T> crudCollection(List<String> coll, Class instanceClazz);

    <T> List<T> crudCollection(List<String> coll, Class instanceClazz, String tableName);
}
