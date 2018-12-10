package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.model.Resume;

import java.util.*;

/**
 * dima
 * 20.07.16.
 */
public class MapStorage extends AbstractStorage {

    private Map<String,Resume> MAP = new HashMap<>();

    @Override
    protected void doSave(Resume r) {
        MAP.put(r.getUuid(),r);
    }

    @Override
    public void doClear() {
        MAP.clear();
    }

    @Override
    protected boolean exist(String uuid) {
        return MAP.containsKey(uuid);
    }

    @Override
    public void doUpdate(Resume r) {
        MAP.put(r.getUuid(),r);
    }

    @Override
    public void doDelete(String uuid) {
        MAP.remove(uuid);
    }

    @Override
    public Resume doLoad(String uuid) {
        return MAP.get(uuid);
    }

    @Override
    public int size() {
        return MAP.size();
    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public List<Resume> doGetAll()

    {
        return new ArrayList<>(MAP.values());
    }

}
