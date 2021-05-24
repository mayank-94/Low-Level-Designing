package library.management.system;

import java.util.List;
import java.util.Map;

public class Catalogue implements Search {
	
	private Map<String, List<Book>> bookTitles;
	private Map<String, List<Book>> bookSubjects;
	private Map<String, List<Book>> bookPublishers;
	
	@Override
	public List<Book> findByTitle(String title) {
		return null;
	}

	@Override
	public List<Book> findBySubject(String subject) {
		return null;
	}

	@Override
	public List<Book> findByPublisher(String publisher) {
		return null;
	}

}
