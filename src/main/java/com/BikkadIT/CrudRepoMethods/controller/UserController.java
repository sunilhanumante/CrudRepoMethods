package com.BikkadIT.CrudRepoMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import com.BikkadIT.CrudRepoMethods.Model.User;
import com.BikkadIT.CrudRepoMethods.Service.UserServiceI;

@Controller
public class UserController {

	@Autowired
	private UserServiceI userServiceI;

	public User saveUser(User user) {
		User saveUserService = userServiceI.saveUserService(user);
		return saveUserService;

	}

	public List<User> saveAllUser(List<User> user) {
		List<User> saveAllUser = userServiceI.saveAllUser((List<User>) user);
		return saveAllUser;

	}

	public User getUser(int userId) {
		User getuser = userServiceI.getUser(userId);
		return getuser;

	}

	public List<User> getAllUser() {
		List<User> allUser = userServiceI.getAllUser();
		return allUser;

	}

	public List<User> getMultipleUser(List<Integer> ids) {
		List<User> multipleUser = userServiceI.getMultipleUser(ids);
		return multipleUser;

	}

	public boolean recordExistsOrNot(int userId) {
		boolean recordExistsOrNot = userServiceI.recordExistsOrNot(userId);
		return recordExistsOrNot;
	}

	public long CountnoOfRecords() {
		long countnoOfRecords = userServiceI.CountnoOfRecords();
		return countnoOfRecords;
	}

	public boolean deleteRecordbyId(int userId) {
		boolean deleteRecordbyId = userServiceI.deleteRecordbyId(userId);
		return deleteRecordbyId;
	}

	public boolean deleteRecordsByMPK(List<Integer> ids) {
		boolean deleteRecordsByMPK = userServiceI.deleteRecordsByMPK(ids);
		return deleteRecordsByMPK;
	}

	public boolean deleteRecordByObject(User user) {
		boolean deleteRecordByObject = userServiceI.deleteRecordByObject(user);
		return deleteRecordByObject;
	}

	public boolean deleteAllRecords() {
		boolean deleteAllRecords = userServiceI.deleteAllRecords();
		return deleteAllRecords;
	}

//-------------------------------------------------------------------
	public Page<User> userPagination() {
		Page<User> userPagination = userServiceI.userPagination();
		return userPagination;
	}

	public List<User> sortingUser() {
		List<User> sortingUser = userServiceI.sortingUser();
		return sortingUser;
	}

//-----------------------------------------------------------------------
 
	public User getUserById(int userId) {
		User user = userServiceI.getUser(userId);
		return user;
	}
	
	public User getUserByIdsql(int userId) {
		User userByIdsql = userServiceI.getUserByIdsql(userId);
		return userByIdsql;
	}
	
	public User loginCheck(String userEmail, String userPass) {
		User loginCheck = userServiceI.loginCheck(userEmail, userPass);
		return loginCheck;
	}

	
	public User loginChecksql(String userEmail, String userPass) {
		User loginChecksql = userServiceI.loginChecksql(userEmail, userPass);
		return loginChecksql;
	}
	
//------------------------------------------------------------------------------
	
	
}
