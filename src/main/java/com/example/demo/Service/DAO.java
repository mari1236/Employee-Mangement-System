package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
	
	public void saveData(T t);
	public List<T> getData();
	public void DeleteData(Long id);
	public Optional<T> getById(Long id);
	public T update(T t);
	

}
