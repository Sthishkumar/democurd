package com.three.democrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Userdao extends  CrudRepository<User, Integer>
{

	 
	  
}

