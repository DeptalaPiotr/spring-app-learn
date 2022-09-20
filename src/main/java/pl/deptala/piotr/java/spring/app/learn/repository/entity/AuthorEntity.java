package pl.deptala.piotr.java.spring.app.learn.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AuthorEntity {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private String nickname;

    public AuthorEntity() {
    }
}
