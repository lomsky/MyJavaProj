package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.WebAppException;
import ru.javawebinar.webapp.model.Resume;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * dima
 * 12.07.16.
 */
public class ArrayStorage implements IStorage {
    private static final int LIMIT = 100;

    //protected Logger LOGGER = Logger.getLogger(getClass().getName());
    private static Logger LOGGER = Logger.getLogger(ArrayStorage.class.getName());
    private Resume[] array = new Resume[LIMIT];
    private int size = 0;
    int idx = 0;

    @Override
    public void clear() {
        LOGGER.info("Delete all resumes");
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    public void save(Resume r) {

//        for (int i = 0; i < LIMIT; i++) {
//            Resume resume = array[i];
//            if (resume != null) {
//                if (r.equals(resume)) {
//                    throw new IllegalStateException("Уже есть такое резюме");
//                }
//
//            }
//        }
//        for (int i = 0; i < LIMIT; i++) {
//            if (array[i] == null) {
//                array[i] = r;
//            }
//        }
        LOGGER.info("Save resume with uuid " + r.getUuid());
        int idx = getIndex(r.getUuid());
        if (idx != -1) throw new WebAppException("Resume " + r.getUuid() + " already exist!", r);
        array[size++] = r;
    }

    @Override
    public void update(Resume r) {

        LOGGER.info("Update resume with uuid " + r.getUuid());
        int idx = getIndex(r.getUuid());
        if (idx == -1) throw new WebAppException("Resume " + r.getUuid() + " not exist!", r);
        array[idx] = r;

    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Resume load(String uuid) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }
    // на вход уид (из резюме, которое пытаюсь сохранить). если такое резюме есть - возвращается его индекс
    private int getIndex(String uuid) {
        for (int i = 0; i < LIMIT; i++) {
            if (array[i] != null) {
                if (array[i].getUuid().equals(uuid)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
