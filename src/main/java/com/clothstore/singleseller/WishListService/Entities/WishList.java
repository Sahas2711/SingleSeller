package com.clothstore.singleseller.WishListService.Entities;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.clothstore.singleseller.AuthService.Entities.Product;
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

@Entity(name="wishlist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WishList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(name="product_id")
	private Product product;
	
	@JoinColumn(name="user_id")
	private User user;
	
}
