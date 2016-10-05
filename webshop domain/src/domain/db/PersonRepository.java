package domain.db;

import java.util.List;

import domain.model.Person;

public interface PersonRepository {

	public Person get(String personId);

	public List<Person> getAll();

	public void add(Person person);

	public void update(Person person);

	public void delete(String personId);

}