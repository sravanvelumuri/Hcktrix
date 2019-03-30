package io.j4c.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.j4c.entity.Request;


@Repository
public interface RegistrationDao extends JpaRepository<Request, Integer> { 
	@Query("select distinct k from Request k where pan = ?1")
	public Request getUserDetails(String pan);
	
	@Query("select k.status from Request k where pan = ?1")
	public String getStatus(String pan);
	
	
	@Modifying
	@Transactional
	@Query("update Request r set r.status = ?1 where r.pan = ?2")
	public void modifyDetails(String status, String panNo);
	

}
