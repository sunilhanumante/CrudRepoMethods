package com.BikkadIT.CrudRepoMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepoMethods.Model.User;
import com.BikkadIT.CrudRepoMethods.controller.UserController;

@SpringBootApplication
public class CrudRepoMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepoMethodsApplication.class, args);
		UserController controller = context.getBean(UserController.class);

//		User user = new User();
//		user.setUserName("Sunil");
//		user.setUserAge(30);
//		user.setUserAddress("Pune");
//		user.setUserEmail("sunil567@gmail.com");
//		user.setUserPass("sunil123");

//		User saveUser = controller.saveUser(user);
//		System.out.println(saveUser);

//		User user1 = new User();
//		user1.setUserName("Aditya");
//		user1.setUserAge(25);
//		user1.setUserAddress("ABAD");
//		user1.setUserEmail("adi77@gmail.com");
//		user1.setUserPass("adi777");
//		
//		User user2 = new User();
//		user2.setUserName("Sam");
//		user2.setUserAge(30);
//		user2.setUserAddress("Mumbai");
//		user2.setUserEmail("sam@gmail.com");
//		user2.setUserPass("sam89m");
//		
//		User user3 = new User();
//		user3.setUserName("MS");
//		user3.setUserAge(35);
//		user3.setUserAddress("Ranchi");
//		user3.setUserEmail("mahi@gmail.com");
//		user3.setUserPass("msd777");
//		
//		List<User> al = new ArrayList<User>();
//		al.add(user1);
//		al.add(user2);
//		al.add(user3);
//		
//		List<User> saveAllUser = controller.saveAllUser(al);
//		System.out.println(saveAllUser);

//		Page<User> userPagination = controller.userPagination();
//		System.out.println(userPagination);
//		for(User u: userPagination) {
//			System.out.println(u);
//		}

//		List<User> sortingUser = controller.sortingUser();
//		System.out.println(sortingUser);
//		for(User s:sortingUser) {
//			System.out.println(s);
//		}

		
//----------------------------------------------------------------------------------

//		User userById = controller.getUserById(2);
//		System.out.println(userById);
		

//		User userByIdsql = controller.getUserByIdsql(7);
//		System.out.println(userByIdsql);
		
		
//		User loginCheck = controller.loginCheck("sam@gmail.com", "sam89m");
//		System.out.println(loginCheck);

		
//		User loginChecksql = controller.loginChecksql("mahi@gmail.com", "msd777");
//		System.out.println(loginChecksql);

		
//--------------------------------------------------------------------------------
		
//		User userById = controller.getUserById(10);    //1
//		System.out.println(userById);

//		User userByUserName = controller.getUserByUserName("Sunil");  //2
//		System.out.println(userByUserName);

//		User loginCheck1 = controller.loginCheck(null, null); //3
//		System.out.println(loginCheck1);
		
//----------------------------------------------------------------------------------

//     	User userById = controller.getUserById(10);
//		System.out.println(userById);

//		User userByIdsql = controller.getUserByIdsql(10);
//	    System.out.println(userByIdsql);
	    
	    
//	    User loginCheck = controller.loginCheck("sam@gmail.com", "sam89m");
//		System.out.println(loginCheck);

		User loginChecksql = controller.loginChecksql("sam@gmail.com", "sam89m");
		System.out.println(loginChecksql);
		
//		User emailOruserPass = controller.getUserByuserEmailOruserPass("sam@gmail.com", "sam123");
//		System.out.println(emailOruserPass);

		
		
//---------------------------------------------------------------------------------		

//		User userId = controller.getUser(4);
//		System.out.println(userId);

//		List<User> allUser = controller.getAllUser();
//		System.out.println(allUser);

//		List<Integer> ids = new ArrayList();
//		ids.add(3);
//		ids.add(4);
//		ids.add(6);
//		List<User> multipleUser = controller.getMultipleUser(ids);
//		System.out.println(multipleUser);

//		List<Integer> ids = new ArrayList();
//		ids.add(3);
//		ids.add(4);
//		ids.add(6);
//		List<User> multipleUser = controller.getMultipleUser(ids);
//		System.out.println(multipleUser);
//
//		boolean recordExistsOrNot = controller.recordExistsOrNot(10);
//		System.out.println(recordExistsOrNot);

//		long countnoOfRecords = controller.CountnoOfRecords();
//		System.out.println(countnoOfRecords);

//		boolean deleteRecordbyId = controller.deleteRecordbyId(2);
//		System.out.println(deleteRecordbyId);

//		List<Integer> ids = new ArrayList();
//		ids.add(3);
//		ids.add(6);
//		boolean deleteRecordsByMPK = controller.deleteRecordsByMPK(ids);
//		System.out.println(deleteRecordsByMPK);

//		User user = new User();
//		user.setUserId(5);
//		boolean deleteRecordByObject = controller.deleteRecordByObject(user);
//		System.out.println(deleteRecordByObject);

//		boolean deleteAllRecords = controller.deleteAllRecords();
//		System.out.println(deleteAllRecords);

	}

}
