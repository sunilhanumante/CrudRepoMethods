package com.BikkadIT.CrudRepoMethods.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepoMethods.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("from User where userId=:userId")
	public User getUser(int userId);

	@Query(value = "select * from  USERS_DETAILS where USERS_ID=:userId", nativeQuery = true)
	public User getUsersql(int userId);

	@Query(value = "from User where userEmail=:userEmail and userPass=:userPass")
	public User loginCheckhql(String userEmail, String userPass);

	@Query(value = "select * from USERS_DETAILS where USERS_EMAIL=:userEmail and USERS_PASS=:userPass", nativeQuery = true)
	public User loginChecksql(String userEmail, String userPass);

//-------------------------------------------------------------------------------

	public User findByUserId(int userId);

	public User findByUserName(String userName); 
	
	public User findByUserEmailAndUserPass(String email,String pass);
    // getUserByUserEmailAndUserPass

//-----------------------------------------------------------------	

}
