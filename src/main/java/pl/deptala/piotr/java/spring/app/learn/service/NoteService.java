package pl.deptala.piotr.java.spring.app.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.deptala.piotr.java.spring.app.learn.repository.NoteRepository;
import pl.deptala.piotr.java.spring.app.learn.web.model.Note;

import java.util.logging.Logger;

@Service
public class NoteService {
    private static final Logger LOGGER = Logger.getLogger(NoteService.class.getName());
//    @Autowired
    private NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    // C - create
    public void create(Note note) {
        LOGGER.info("create(" + note + ")");
//        noteRepository.create(note);
    }

    // R - read
    public void read() {
    }

    // U - update
    public void update() {
    }

    // D - delete
    public void delete() {
    }

    // L - list
    public void list() {
    }
}
