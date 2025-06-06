package com.student.user_service;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String role; // STUDENT, OWNER, ADMIN
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}