package ru.maliutin.seminar6hw1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.maliutin.seminar6hw1.models.Note;
import ru.maliutin.seminar6hw1.models.exceptions.ResourceNotFoundException;
import ru.maliutin.seminar6hw1.repositories.NoteRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class NoteServiceImpl implements NoteService{
    /**
     * Репозиторий для работы с сущностью заметки.
     */
    private final NoteRepository repository;

    /**
     * Получение всех заметок.
     * @return список заметок.
     */
    @Override
    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    /**
     * Получение конкретной заметки.
     * @param id идентификатор заметки.
     * @throws ResourceNotFoundException исключение при отсутствии данных в БД.
     * @return объект заметки или генерация исключения при отсутствии.
     */
    @Override
    public Note getNoteById(Long id) throws ResourceNotFoundException{
        return repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Note " + id + " not found!"));
    }

    /**
     * Создание новой заметки.
     * @param note объект заметки.
     * @return созданную заметку.
     */
    @Override
    public Note createNote(Note note) {
        note.setCreateDate(LocalDateTime.now());
        return repository.save(note);
    }

    /**
     * Обновление существующей заметки.
     * @param id идентификатор заметки.
     * @param note объект заметки с обновленными данными.
     * @throws ResourceNotFoundException исключение при отсутствии данных в БД.
     * @return обновленную заметку.
     */
    @Override
    public Note updateNote(Long id, Note note) throws ResourceNotFoundException{
        Note noteForUpdate = getNoteById(id);
        noteForUpdate.setTitle(note.getTitle());
        noteForUpdate.setDescription(note.getDescription());
        return repository.save(noteForUpdate);
    }

    /**
     * Удаление существующей заметки.
     * @param id идентификатор заметки.
     * @throws ResourceNotFoundException исключение при отсутствии данных в БД.
     */
    @Override
    public void removeNote(Long id) throws ResourceNotFoundException{
        // Проверка на существование, для генерации исключения.
        getNoteById(id);
        repository.deleteById(id);
    }
}
