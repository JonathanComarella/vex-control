package br.com.vexcontrol.vexcontrol.repositories;

import br.com.vexcontrol.vexcontrol.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
