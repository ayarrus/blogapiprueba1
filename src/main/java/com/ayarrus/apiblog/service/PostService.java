package com.ayarrus.apiblog.service;

import com.ayarrus.apiblog.model.Post;
import com.ayarrus.apiblog.payload.ApiResponse;
import com.ayarrus.apiblog.payload.PagedResponse;
import com.ayarrus.apiblog.payload.PostRequest;
import com.ayarrus.apiblog.payload.PostResponse;
import com.ayarrus.apiblog.security.UserPrincipal;

public interface PostService {

	PagedResponse<Post> getAllPosts(int page, int size);

	PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);

	Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);

	ApiResponse deletePost(Long id, UserPrincipal currentUser);

	PostResponse addPost(PostRequest postRequest, UserPrincipal currentUser);

	Post getPost(Long id);

}
