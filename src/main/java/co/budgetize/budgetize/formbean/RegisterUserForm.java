package co.budgetize.budgetize.formbean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterUserForm {

    @NotNull
    @Size(min=2, max=30)
    private String username;

    private boolean enabled;

    @NotNull
    @Email(message = "Invalid email address")
    private String email;

    @NotNull
    @Size(min=2, max=30)
    private String password;

    @NotNull
    @Size(min=2, max=30)
    private String confirmPassword;

    public RegisterUserForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String toString() {
        return "UserName: " + this.username + ", Email: " + this.email + ")";
    }
}
