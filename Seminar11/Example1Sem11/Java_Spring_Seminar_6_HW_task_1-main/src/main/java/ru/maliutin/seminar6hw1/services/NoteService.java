package ru.maliutin.seminar6hw1.services;

import ru.maliutin.seminar6hw1.models.Note;

import java.util.List;

public interface NoteService {
    /**
     * Получение всех заметок.
     * @return список заметок.
     */
    List<Note> getAllNotes();

    /**
     * Получение конкретной заметки.
     * @param id идентификатор заметки.
     * @return объект заметки.
     */
    Note getNoteById(Long id);

    /**
     * Создание заметки.
     * @param note объект заметки.
     * @return созданный объект заметки.
     */
    Note createNote(Note note);

    /**
     * Обновление заметки.
     * @param id идентификатор заметки.
     * @param note объект заметки с обновленными данными.
     * @return обновленный объект заметки.
     */
    Note updateNote(Long id, Note note);

    /**
     * Удаление заметки.
     * @param id идентификатор заметки.
     */
    void removeNote(Long id);
}
