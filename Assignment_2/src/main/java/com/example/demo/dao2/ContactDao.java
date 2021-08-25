package com.example.demo.dao2;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity2.Contact;

public interface ContactDao extends JpaRepository<Contact, Long> {

}
