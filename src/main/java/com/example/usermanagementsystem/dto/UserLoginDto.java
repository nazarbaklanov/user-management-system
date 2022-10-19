package com.example.usermanagementsystem.dto;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserLoginDto {
    @NotBlank(message = "login must be not blank")
    private String login;
    @NotBlank(message = "login must be not blank")
    private String password;
}
