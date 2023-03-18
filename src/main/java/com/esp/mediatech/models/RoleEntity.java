package com.esp.mediatech.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity {
    @Id
	private Integer roleId;
    @Column(nullable = false)
	private String name;
	@ManyToMany
	@JoinTable(name = "user_roles",joinColumns = @JoinColumn(name="roleId"),inverseJoinColumns = @JoinColumn(name="userId"))
	private List<UserEntity> users;
	
	
	
}
