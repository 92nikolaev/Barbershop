package by.nikolaev.ilya.barbershop.service;

import by.nikolaev.ilya.barbershop.bean.User;
 
/*�������� � ��������� ������ � ��������� � �� */
public interface UserService {
	User singinUser(User user);
	User signupUser(User user, String pasword);
	User EditProfile(User user);
}
