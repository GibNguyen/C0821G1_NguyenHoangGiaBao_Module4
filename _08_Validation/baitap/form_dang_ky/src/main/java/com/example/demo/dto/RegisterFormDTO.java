package com.example.demo.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class RegisterFormDTO  {
    @NotNull(message = "ten khong duoc de trong")
    @NotEmpty(message = "Tên không được để trống(Not empty)")
    @NotBlank(message = "Tên không được để trống(Not Blank)")
    @Pattern(regexp = "^[A-Za-z]{5,}$",message = "Tên phải có ít nhất 5 kí tự")
    private String firstName;

    @NotNull(message = "ten khong duoc de trong")
    @NotEmpty(message = "Tên không được để trống(Not empty)")
    @NotBlank(message = "Tên không được để trống(Not Blank)")
    @Pattern(regexp = "^[A-Za-z]{5,}$",message = "Tên phải có ít nhất 5 kí tự")
    private String lastName;

    private int phone;

    @Min(value = 18,message = "tuổi phải lớn hơn hoặc bằng 18")
    private int age;

    private String email;

    public RegisterFormDTO() {
    }

    public RegisterFormDTO(String firstName, String lastName, int phone, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        RegisterFormDTO registerFormDTO=(RegisterFormDTO) target;
//        if(!registerFormDTO.lastName.matches("[A-Za-z ]{6,}")){
//            errors.rejectValue("lastName","lastName.invalidFormat");
//        }
//    }
}
