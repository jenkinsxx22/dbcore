package com.db.core;
import com.db.core.model.User;
import com.db.core.dao.UserDao;
import java.util.List;
import java.util.ArrayList;
public class Main {

	static UserDao userdao;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userdao = new UserDao();
		User user1 = new User("Nisar Ahmed","Abbasi",null,"M","ADMIN","cengr.nisar.ahmed@gmail.com","Nisar@2022");
		User user2 = new User("Lal Khundum","Fero",null,"M","USER","lalkhundumfero@gmail.com","Fero@2023");
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		//userList.forEach(u->userdao.SaveUser(u));
		userdao.SaveUser(user1);
		userdao.SaveUser(user2);
		
	}

}
