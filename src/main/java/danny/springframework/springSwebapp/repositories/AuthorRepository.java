package danny.springframework.springSwebapp.repositories;

import danny.springframework.springSwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
