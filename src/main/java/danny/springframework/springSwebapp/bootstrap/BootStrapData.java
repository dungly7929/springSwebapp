package danny.springframework.springSwebapp.bootstrap;

import danny.springframework.springSwebapp.domain.Author;
import danny.springframework.springSwebapp.domain.Book;
import danny.springframework.springSwebapp.repositories.AuthorRepository;
import danny.springframework.springSwebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner
{
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Author danny = new Author("Danny","Danny");
        Book bok = new Book("Hihih hehehe","3211");
        danny.getBooks().add(bok);
        bok.getAuthors().add(danny);

        authorRepository.save(danny);
        bookRepository.save(bok);

        Author joh = new Author("joh", "Hehe");
        Book ez = new Book("ezzz", "3334");
        joh.getBooks().add(ez);
        ez.getAuthors().add(joh);

        authorRepository.save(joh);
        bookRepository.save(ez);

        System.out.println("Count " + bookRepository.count());

    }
}
