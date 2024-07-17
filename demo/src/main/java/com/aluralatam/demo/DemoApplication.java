package com.aluralatam.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@Entity
@SpringBootApplication
public class DemoApplication {
	@Repository
	public interface BookRepository extends JpaRepository<Book, Long> {
		Optional<Book> findByTitle(String title);
	}
	@Repository
	public interface AuthorRepository extends JpaRepository<Author, Long> {
		// Método para encontrar autores vivos en un año específico
		@Query("SELECT a FROM Author a WHERE :year BETWEEN YEAR(a.birthDate) AND YEAR(a.deathDate)")
		List<Author> findAuthorsAliveInYear(@Param("year") int year);
	}

	}