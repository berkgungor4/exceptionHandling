package dataAccess.concretes;

import java.lang.reflect.Array;
import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	ArrayList<User> users = new ArrayList<User>();
	@Override
	public void add(User entity) {
		users.add(entity);
		System.out.println(entity.getFirstName()+"  eklendi.");
	}

	@Override
	public void update(User entity) {

	}

	@Override
	public void delete(User entity) {
		
	}
	
	public ArrayList<User> getAll() {
		return users;
	}

	@Override
	public ArrayList<String> eMailGetAll() {
		
		ArrayList<String> eMails = new ArrayList<String>();
		for (User user : users) {
			eMails.add(user.geteMail());
		}
		return eMails;
	}

}
