package ru.maliutin.seminar6hw1.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Сущность заметки.
 */
@Data
@Entity
@Table(name = "notes")
public class Note {
    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Заголовок.
     */
    private String title;
    /**
     * Содержимое.
     */
    private String description;
    /**
     * Дата создания.
     */
    private LocalDateTime createDate;

}
