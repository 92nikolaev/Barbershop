package by.nikolaev.ilya.barbershop.service;

import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.service.exeption.ServiceException;
 
/*проверка и валидация данный и обращения к бд */
/* this is interface used for Registracion, Sign In and edit profile*/
public interface UserService {
	User singinUser(User user) throws ServiceException;;
	User signupUser(User user, String pasword) throws ServiceException;;
	User EditProfile(User user) throws ServiceException;;
}
