package ru.javawebinar.webapp.model;

/**
 * dima
 * 11.07.16.
 */
public enum SectionType {
    ACHIEVEMENT("Достижения"),
    QUALIFICATIONS("Квалификация"),
    OBJECTIVE("Позиция"),
    EDUCATION("Образование"),
    EXPERIENCE("Опыт работы");

    private String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
