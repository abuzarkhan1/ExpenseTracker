package com.abuzar.authservice.service;

import com.abuzar.authservice.entities.RefreshToken;
import org.springframework.data.repository.Repository;

interface RefreshTokenRepository extends Repository<RefreshToken, Integer> {
}
