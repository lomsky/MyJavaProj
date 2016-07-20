package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.WebAppException;
import ru.javawebinar.webapp.model.Resume;

import java.util.logging.Logger;

/**
 * dima
 * 20.07.16.
 */
public abstract class AbstractStorage implements IStorage {
    protected Logger logger = Logger.getLogger(getClass().getName());
    @Override
    public void save(Resume r) {

        logger.info("Save resume with uuid " + r.getUuid());
//        int idx = getIndex(r.getUuid());
//        if (idx != -1) throw new WebAppException("Resume " + r.getUuid() + " already exist!", r);
//        array[size++] = r;
        doSave(r);

    }
    protected abstract void doSave(Resume r);
}
