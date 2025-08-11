package com.github.pedrorenan.pr_ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;
    @OneToMany(mappedBy = "client") // mapeia que um client vai ter muitos pedidos
    private List<Order> orders = new ArrayList<>();
}
