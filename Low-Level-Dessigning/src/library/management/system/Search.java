package library.management.system;

import java.util.List;

public interface Search {
	List<Book> findByTitle(final String title);
	List<Book> findBySubject(final String subject);
	List<Book> findByPublisher(final String publisher);
}
