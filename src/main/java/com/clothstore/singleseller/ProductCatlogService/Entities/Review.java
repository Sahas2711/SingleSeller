package com.clothstore.singleseller.ProductCatlogService.Entities;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.clothstore.singleseller.AuthService.Entities.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="Review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(name="product_id")
	private Product product;
	
	@JoinColumn(name="user_id")
	private User user;
	
	@Column
	private int rating;
	
	@Column
	private String comment;
	
	@Column
	@CreationTimestamp
	private LocalDate createdAt;
	
	@Column
	@UpdateTimestamp
	private LocalDate updatedAt;
}
