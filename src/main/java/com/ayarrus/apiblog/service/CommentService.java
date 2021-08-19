package com.ayarrus.apiblog.service;

import com.ayarrus.apiblog.model.Comment;
import com.ayarrus.apiblog.payload.ApiResponse;
import com.ayarrus.apiblog.payload.CommentRequest;
import com.ayarrus.apiblog.payload.PagedResponse;
import com.ayarrus.apiblog.security.UserPrincipal;

public interface CommentService {

	PagedResponse<Comment> getAllComments(Long postId, int page, int size);

	Comment addComment(CommentRequest commentRequest, Long postId, UserPrincipal currentUser);

	Comment getComment(Long postId, Long id);

	Comment updateComment(Long postId, Long id, CommentRequest commentRequest, UserPrincipal currentUser);

	ApiResponse deleteComment(Long postId, Long id, UserPrincipal currentUser);

}
