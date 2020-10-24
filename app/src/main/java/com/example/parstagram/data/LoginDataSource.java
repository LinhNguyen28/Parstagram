package com.example.parstagram.data;

import android.util.Log;

import com.example.parstagram.data.model.LoggedInUser;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {
    public Result<LoggedInUser> login(String username, String password) {
        try {
            ParseUser user = ParseUser.logIn(username, password);
            LoggedInUser loggedInUser = new LoggedInUser(user.getObjectId(), user.getUsername());
            return new Result.Success<>(loggedInUser);
        } catch (ParseException e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
    }
}