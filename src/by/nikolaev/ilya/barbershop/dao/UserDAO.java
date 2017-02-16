package by.nikolaev.ilya.barbershop.dao;

import by.nikolaev.ilya.barbershop.bean.User;

public interface UserDAO {
	
	User singinUser(User user);
	User signupUser(User user, String securPasword);
	User EditProfile(User user);
}
