package com.ayarrus.apiblog.service;

import com.ayarrus.apiblog.model.user.User;
import com.ayarrus.apiblog.payload.ApiResponse;
import com.ayarrus.apiblog.payload.InfoRequest;
import com.ayarrus.apiblog.payload.UserIdentityAvailability;
import com.ayarrus.apiblog.payload.UserProfile;
import com.ayarrus.apiblog.payload.UserSummary;
import com.ayarrus.apiblog.security.UserPrincipal;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}