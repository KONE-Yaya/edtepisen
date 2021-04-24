package edtepisen.upec.fr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edtepisen.upec.fr.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
