package com.jeffdev.twitterapi.controller;


import com.jeffdev.twitterapi.model.Hashtag;
import com.jeffdev.twitterapi.service.HashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hashtags")
public class HashtagController {

    private HashtagService hashtagService;

    @Autowired
    public void setHashtagService(HashtagService hashtagService) {
        this.hashtagService = hashtagService;
    }

    /**
     * Retrieves a list of trending hashtags sorted by the number of tweets associated with each hashtag.
     *
     * @return A list of hashtags in descending order of their popularity.
     */
    @GetMapping(path = "/trending")
    public List<Hashtag> getTrendingHashtags() {
        return hashtagService.getTrendingHashtags();
    }

}
