package com.three.democrud;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserInterface extends  JpaRepository<User, Integer>
{

	 
	  
}