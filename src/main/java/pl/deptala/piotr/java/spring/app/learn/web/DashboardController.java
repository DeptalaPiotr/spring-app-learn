package pl.deptala.piotr.java.spring.app.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static pl.deptala.piotr.java.spring.app.learn.web.AuthorController.LOGGER;

@Controller
@RequestMapping (value = "/")
public class DashboardController {

    @GetMapping
    public String dashboardView(){
        LOGGER.info("dashboardView()");
        return "dashboard";
    }
}
// TODO: 16.08.2022
// https://geek.justjoin.it/komunikacja-frontend-www-z-backend-w-javie
// Wzorując się na artykule spróbować stworzyć formulaż html przesyłąjący dane z przeglądarki do kodu java
