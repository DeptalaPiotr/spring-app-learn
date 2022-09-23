package pl.deptala.piotr.java.spring.app.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.deptala.piotr.java.spring.app.learn.service.NoteService;
import pl.deptala.piotr.java.spring.app.learn.web.model.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/notes")
public class NoteController {

    private static final Logger LOGGER = Logger.getLogger(NoteController.class.getName());
    private List<Note> notes = new ArrayList<>();
//    @Autowired
    private NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public String list() {
        LOGGER.info("lists() = " + notes);
//        return "notes/notes";
        return "notes";
    }

    @GetMapping(value = "/create")
    public String createView(ModelMap modelMap) {
        LOGGER.info("createView(" + modelMap + ")");
        Note note = new Note();
        modelMap.addAttribute("note", note);
        //return "notes/create-note";
        return "create-note";
    }

    @PostMapping
    public String create(Note note) {
        LOGGER.info("create(" + note + ")");
        notes.add(note);
        noteService.create(note);
        return "redirect:/notes";
    }

//    // C - create
//    public void create() {
//    }
//
//    // R - read
//    public void read() {
//    }
//
//    // U - update
//    public void update() {
//    }
//
//    // D - delete
//    public void delete() {
//    }
//
//    // L - list
//    public void list() {
//    }
}
