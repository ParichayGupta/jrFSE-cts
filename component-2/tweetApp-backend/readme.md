
# TweetApp-backend

TweetApp-backend is a spring boot application having the backend for the twitter clone created in Angular.
___

## FEATURES

- Register a new user
- Login an existing user
- Posting a tweet 
- Updating a tweet
- Delete a tweet
- Like/Dislike a tweet
- Comment on a tweet
- View all users
- View Tweets of a user

___

## API REFERENCE

The base package for application is 
...
/api/v1.0/tweets
...
#### Get all tweets

```
  `GET` /all
```

#### Register a new user

```
  `POST` /register
```

#### login an existing user

```
  `POST` /login
```

#### forgot Password

```
  `PUT` /forgot
```

#### Post a tweet

```
  `POST` /{username}/add
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `username`      | `string` | **Required**. user who is posting the tweet. |

___

___

## DOCKERIZATION OF THE APPLICATION

First build the `jar` file for our spring boot application.

then run the Dockerfile using 

  `docker build -t <docker_image_name> . `

p.s. <docker_image_name> is what you will give image name as it is not present in the docker unless you run the command.

___

## TweetApp-angular

#### Tweetapp-clone (Frontend) is  running on

```
  localhost:4200
```

