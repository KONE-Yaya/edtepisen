package edtepisen.upec.fr.services;

import java.util.List;

import edtepisen.upec.fr.models.User;

public interface UserService {
	
	 List < User > getAllUsers();
	 void saveUser(User user);
	 User getUserById(long id);
	 void deleteUserById(long id);

}
