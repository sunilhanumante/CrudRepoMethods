package com.BikkadIT.CrudRepoMethods.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepoMethods.Model.User;

public interface UserServiceI {

	User saveUserService(User user);

	public List<User> saveAllUser(List<User> user);

	public User getUser(int userId);

	public List<User> getAllUser();

	public List<User> getMultipleUser(List<Integer> ids);

	public boolean recordExistsOrNot(int userId);

	public long CountnoOfRecords();

	public boolean deleteRecordbyId(int userId);

	public boolean deleteRecordsByMPK(List<Integer> ids);

	public boolean deleteRecordByObject(User user);

	public boolean deleteAllRecords();

	// ----------------------------------------------------------

	public Page<User> userPagination();

	public List<User> sortingUser();

	// -----------------------------------------------------------

	public User getUserById(int userId);

	public User getUserByIdsql(int userId);

	public User loginCheck(String userEmail, String userPass);

	public User loginChecksql(String userEmail, String userPass);

//------------------------------------------------------------------------

	public User getUserByUsetrId(int userId);

	public User getUserByUserName(String userName);

	public User loginCheck1(String userEmail, String userPass); // like bellow
	//(public User findByUserEmailAndUserPass(String userEmail, String userPass);

//-----------------------------------------------------------------------------

	
	
}
