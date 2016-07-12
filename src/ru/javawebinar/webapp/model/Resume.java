package ru.javawebinar.webapp.model;

import java.util.List;

/**
 * dima
 * 09.07.16.
 */
public class Resume {
    private String uuid;
    private String fullName;
    private String location;
    private String homepage;

    private List<Contact> contacts;
    private List<Section> sections;

    public Resume(String fullName, String location) {
        this.fullName = fullName;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        return uuid.equals(resume.uuid);

    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
