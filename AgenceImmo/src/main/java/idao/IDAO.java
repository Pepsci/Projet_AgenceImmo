package idao;

import java.util.List;

import model.Test;

public interface IDAO<T> {

	public boolean create(T object);
	public List<T> read();
	public boolean update(T object);
	boolean delete(T object);
	boolean delete(int Id_test);
}
