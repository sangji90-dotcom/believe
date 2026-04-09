package com.rental.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.dao.PostDAO;
import com.rental.dto.Post;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDAO postDAO;

    @Override
    public List<Post> getPosts(String category, String postType, String status) {
        return postDAO.getPosts(category, postType, status);
    }
}