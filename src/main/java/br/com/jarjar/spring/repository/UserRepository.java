package br.com.jarjar.spring.repository;

import br.com.jarjar.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository // anotação opcional já que estamos herdando do JPARepository
public interface UserRepository extends JpaRepository<User, Long>  {




}
