package com.example.demodto.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserDto {
    private int id;

    @NotBlank(message = "name not blank")
    private String name;

    private String phone;

    @Min(value = 16, message = "Chua du 16")
    @Max(value = 100, message = "Lon tuoi qua")
    private int age;
}
