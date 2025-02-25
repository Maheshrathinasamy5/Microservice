package com.example.school;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullSchoolResponse {
    private String name;
    private String email;

    List<Student> students;
}
