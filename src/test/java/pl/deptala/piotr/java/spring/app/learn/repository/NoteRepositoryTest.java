package pl.deptala.piotr.java.spring.app.learn.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.deptala.piotr.java.spring.app.learn.repository.entity.NoteEntity;
import pl.deptala.piotr.java.spring.app.learn.web.model.Note;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class NoteRepositoryTest {
    @Autowired
    private NoteRepository noteRepository;

    @Test
    void create() {
        // Given
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setTitle("Title from test");
        noteEntity.setContent("Content form test");
        // When
        noteRepository.save(noteEntity);
        // Then

    }

}