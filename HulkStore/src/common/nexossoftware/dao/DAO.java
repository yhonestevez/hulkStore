package common.nexossoftware.dao;

public interface DAO  <T>{
	
	void insert (T data);
	void update (T data);
	T consult (T data);

}
