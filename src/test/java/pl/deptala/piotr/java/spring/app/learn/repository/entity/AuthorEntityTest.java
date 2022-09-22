package pl.deptala.piotr.java.spring.app.learn.repository.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.deptala.piotr.java.spring.app.learn.repository.AuthorRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorEntityTest {
    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void create() {
        //Given
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setFirstName("Name from test");
        authorEntity.setNickname("Nickname from test");
        //When
        authorRepository.save(authorEntity);
        //Then
    }
}