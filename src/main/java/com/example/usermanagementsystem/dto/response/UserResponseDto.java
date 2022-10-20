package com.example.usermanagementsystem.dto.response;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Set;
import com.example.usermanagementsystem.model.RoleName;
import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private RoleName role;
    private String status;
    private LocalDateTime createdAt;
}
