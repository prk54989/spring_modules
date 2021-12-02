package com.platform.security.jwt.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;
}