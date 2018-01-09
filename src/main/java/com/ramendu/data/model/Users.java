package com.ramendu.data.model;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author rams0516
 *         Date: 1/8/2018
 *         Time: 6:21 PM
 */
public class Users {
    private int id;

    @Size(min = 5, max = 100, message = "Enter a valid name")
    private String name;
    @Size(min = 4, max = 15, message = "Username should be between 4 and 15 characters")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    private String email;

    @NotNull
    @Size(min = 10, max = 50, message = "Password should be between 10 and 50 characters")
    private String password;

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}