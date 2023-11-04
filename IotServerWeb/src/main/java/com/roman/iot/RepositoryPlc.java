package com.roman.iot;

import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface RepositoryPlc extends CrudRepository<Places, String>{
	 
	public Places findById(long plc_id);

}







