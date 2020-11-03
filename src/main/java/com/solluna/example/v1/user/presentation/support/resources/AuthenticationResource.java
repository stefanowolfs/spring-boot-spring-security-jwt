package com.solluna.example.v1.user.presentation.support.resources;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResource {

    private final String jwt;

}
