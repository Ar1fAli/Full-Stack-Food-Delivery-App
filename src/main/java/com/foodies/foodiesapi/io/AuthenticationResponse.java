package com.foodies.foodiesapi.io;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthenticatoinResponse {
    private String email;
    private String token;
}
