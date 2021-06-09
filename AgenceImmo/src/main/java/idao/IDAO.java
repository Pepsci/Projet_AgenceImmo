package idao;

import java.util.List;

public interface IDAO<T> {

	public boolean create(T object);
	public List<T> read();
	public boolean update(T object);
	boolean delete(T object);
}
