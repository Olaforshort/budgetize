package co.budgetize.budgetize.service;

import co.budgetize.budgetize.models.User;

public interface UserService {

    public void saveUser(User user);
    public boolean isUserAlreadyPresent(User user);
    public void changeUserPassword(User user, String password);
}
