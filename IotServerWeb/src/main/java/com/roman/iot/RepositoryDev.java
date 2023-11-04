package com.roman.iot;

import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface RepositoryDev extends CrudRepository<Devices, Long> {
	
	
	public Devices findById(long dev_id);
	
}    