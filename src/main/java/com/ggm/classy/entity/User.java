package com.ggm.classy.entity;

import com.ggm.classy.entity.type.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity{

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @Column(name = "provider", nullable = false)
    private String provider;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;

}
