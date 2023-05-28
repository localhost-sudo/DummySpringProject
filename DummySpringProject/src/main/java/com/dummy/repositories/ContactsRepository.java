package com.dummy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dummy.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {
	@Query("select u from Contacts u where u.user.id=:id")
	public List<Contacts> getAllContactsByUser(@Param("id") int id);

}
