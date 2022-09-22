package pl.deptala.piotr.java.spring.app.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.deptala.piotr.java.spring.app.learn.repository.entity.AuthorEntity;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {
}
