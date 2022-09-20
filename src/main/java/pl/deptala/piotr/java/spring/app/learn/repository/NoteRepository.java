package pl.deptala.piotr.java.spring.app.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.deptala.piotr.java.spring.app.learn.repository.entity.NoteEntity;
import pl.deptala.piotr.java.spring.app.learn.web.model.Note;

import java.util.logging.Logger;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
}
