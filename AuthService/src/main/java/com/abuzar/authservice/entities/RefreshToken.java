package com.abuzar.authservice.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tokens")
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String token;

    private Instant expiryDate;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
