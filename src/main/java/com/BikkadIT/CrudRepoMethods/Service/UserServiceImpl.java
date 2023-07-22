package com.BikkadIT.CrudRepoMethods.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepoMethods.Model.User;
import com.BikkadIT.CrudRepoMethods.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserRepository userRepository;
	
    @Transactional
    public void addUser(User user){
    	userRepository.saveAndFlush(user);
    }

	@Override
	public User saveUserService(User user) {
		User user2 = userRepository.save(user);
		return user2;

	}

	@Override
	public List<User> saveAllUser(List<User> user) {
		List<User> saveAll = (List<User>) userRepository.saveAll(user);
		return saveAll;
	}

	@Override
	public User getUser(int userId) {
		User findById = userRepository.findById(userId).get();
		return findById;
	}

	@Override
	public List<User> getAllUser() { // get user ---not need to pass parameters
		List<User> findAll = (List<User>) userRepository.findAll();
		return findAll;
	}

	@Override
	public List<User> getMultipleUser(List<Integer> ids) {
		List<User> findAllById = (List<User>) userRepository.findAllById(ids);
		return findAllById;
	}

	@Override
	public boolean recordExistsOrNot(int userId) {
		boolean existsById = userRepository.existsById(userId);
		return existsById;
	}

	@Override
	public long CountnoOfRecords() {
		long count = userRepository.count();
		return count;
	}

	@Override
	public boolean deleteRecordbyId(int userId) {
		boolean existsById = userRepository.existsById(userId);
		if (existsById) {
			userRepository.deleteById(userId);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteRecordsByMPK(List<Integer> ids) {
		List<User> findAllById = userRepository.findAllById(ids);
		System.out.println(findAllById);
		if (findAllById.isEmpty()) {
			return false;
		} else {
			userRepository.deleteAllById(ids);
			return true;
		}
	}

	@Override
	public boolean deleteRecordByObject(User user) {
		boolean existsById = userRepository.existsById(user.getUserId());
		if (existsById) {
			userRepository.delete(user);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteAllRecords() {
		List<User> findAll = userRepository.findAll();
		if (findAll.isEmpty()) {
			return false;
		} else {
			userRepository.deleteAll();
			return true;
		}

	}

//----------------------------------------------------------------------
	@Override
	public Page<User> userPagination() {
		PageRequest pageRequest = PageRequest.of(1, 4);
		Page<User> page = userRepository.findAll(pageRequest);
		return page;
	}

	@Override
	public List<User> sortingUser() {
		List<User> findAll = userRepository.findAll(Sort.by("userId").descending());
		return findAll;
	}

//--------------------------------------------------------------------------------

	@Override
	public User getUserById(int userId) {
		User user = userRepository.getUser(userId);
		return user;
	}

	@Override
	public User getUserByIdsql(int userId) {
		User usersql = userRepository.getUsersql(userId);
		return usersql;
	}

	@Override
	public User loginCheck(String userEmail, String userPass) {
		User loginCheckhql = userRepository.loginCheckhql(userEmail, userPass);
		return loginCheckhql;
	}

	@Override
	public User loginChecksql(String userEmail, String userPass) {
		User loginChecksql = userRepository.loginChecksql(userEmail, userPass);
		return loginChecksql;
	}

//--------------------------------------------------------------------------------

	@Override
	public User getUserByUsetrId(int userId) {
		User findByUserId = userRepository.findByUserId(userId);
		return findByUserId;
	}

	@Override
	public User getUserByUserName(String userName) {
		User findByUserName = userRepository.findByUserName(userName);
		return findByUserName;
	}

	@Override
	public User loginCheck1(String userEmail, String userPass) {
		User findByUserEmailAndUserPass = userRepository.findByUserEmailAndUserPass(userEmail, userPass);
		return findByUserEmailAndUserPass;
	}

	//----------------------------------------------------------------------------
	
	

	
		

}
