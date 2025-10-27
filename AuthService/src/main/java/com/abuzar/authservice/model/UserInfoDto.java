package com.abuzar.authservice.model;

import com.abuzar.authservice.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDto  extends UserInfo {

    private String username;

    private String lastName;

    private String phoneNumber;

    private String email;


}
