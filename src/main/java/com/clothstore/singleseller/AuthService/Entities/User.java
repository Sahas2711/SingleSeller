package com.clothstore.singleseller.AuthService.Entities;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="f_name")
	private String first_name;
	
	@Column(name="l_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="hashedPassword")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column
	@CreationTimestamp
	private LocalDate createdAt;
	
	@Column
	@UpdateTimestamp
	private LocalDate updatedAt;
	
}
