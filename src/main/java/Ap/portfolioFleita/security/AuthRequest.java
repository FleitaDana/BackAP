package Ap.portfolioFleita.security;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

public class AuthRequest {
    @Email
    @Length(min=5, max=50)
    private String email;
    @Length(min=5, max=50)
    private String Password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
