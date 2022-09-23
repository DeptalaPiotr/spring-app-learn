package pl.deptala.piotr.java.spring.app.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/authors")
public class AuthorController {

    public static final Logger LOGGER = Logger.getLogger(AuthorController.class.getName());

    @GetMapping
    public String createView() {
        LOGGER.info("createView()");
        return "create-author";
    }

    public void create() {

    }

}
