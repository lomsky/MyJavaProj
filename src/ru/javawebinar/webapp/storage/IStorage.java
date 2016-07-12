package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.model.Resume;

import java.util.Collection;

/**
 * dima
 * 12.07.16.
 */
public interface IStorage {
    void clear();
    void save(Resume r);
    void update(Resume r);
    void delete(String uuid);
    Resume load(String uuid);
    int size();
    Collection<Resume> getAllSorted();

}
