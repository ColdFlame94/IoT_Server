package com.roman.iot;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

 //This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
 //CRUD refers Create, Read, Update, Delete
@Transactional
public interface RepositoryUser extends CrudRepository<User, Long> {

   /**
   * This method will find an User instance in the database by its email.
   * Note that this method is not implemented and its working code will be
   * automatically generated from its signature by Spring Data JPA.
   */
	  public User findByEmail(String email);

	  public User findById(long user_id);

}
 