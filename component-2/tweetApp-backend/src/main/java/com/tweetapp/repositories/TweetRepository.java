package com.tweetapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.entities.Tweet;
import java.lang.String;
import java.util.List;

@Repository
public interface TweetRepository extends MongoRepository<Tweet, String> {
	List<Tweet> findByUsername(String username);
	List<Tweet> findByTweetId(String tweetId);
}
