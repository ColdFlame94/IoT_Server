package com.roman.iot;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

 //This will be AUTO IMPLEMENTED by Spring into a Bean called DevRepository
 //CRUD refers Create, Read, Update, Delete
@Transactional
public interface RepositoryLogs extends CrudRepository<Logs, String> {
	
	public Logs findById(long id);
	
	@Modifying
	@Query(value="delete from Logs", nativeQuery=true)
	int clearTable();	
}

