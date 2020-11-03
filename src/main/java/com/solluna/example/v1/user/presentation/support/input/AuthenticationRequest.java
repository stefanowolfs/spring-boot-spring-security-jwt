package com.solluna.example.v1.user.presentation.support.input;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthenticationRequest {

    private String username;

    private String password;

}
