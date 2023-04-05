package com.codegym.validate_registration_form.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column(name = "first_name", columnDefinition = "varchar(45)")
    @NotBlank(message = "Tên không được để trống")
    @Size(min = 5, max = 45, message = "Tên phải 5-45 ký tự")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "varchar(45)")
    @NotBlank(message = "Tên không được để trống")
    @Size(min = 5, max = 45, message = "Tên phải 5-45 ký tự")
    private String lastName;

    @Column(name = "phone_number", columnDefinition = "varchar(45)")
    @NotNull(message = "Không được để trống")
    @Pattern(regexp = "^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$",
    message = "Số điện thoại phải đúng định dạng. Ví dụ: 0********* hoặc 84**********")
    private String phoneNumber;

    @Column(name = "age", columnDefinition = "int")
    @NotNull(message = "Không được để trống")
    @Min(value = 18, message = "Tuổi phải >= 18")
    private Integer age;

    @Column(name = "email", columnDefinition = "varchar(100)")
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",message = "Không được chứa ký tự đặc biệt như (#$%&'*+/=?`{|}~^.-). Ví dụ:lanh@gmail.com")
    private String email;

    public User() {
    }

    public User(Integer idUser, String firstName, String lastName, String phoneNumber, Integer age, String email) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
