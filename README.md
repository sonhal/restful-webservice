[![Build Status](https://travis-ci.com/sonhal/restful-webservice.svg?branch=master)](https://travis-ci.com/sonhal/restful-webservice)
# RESTful Web Service

Social Media Application

User -> Posts


- Retrive all Users     - GET /users
- Create a User         - POST /users
- Retrieve one User     - GET /users/{user_id} -> users/1
- Delete a User         - DELETE /users/{user_id}


 - Retrieve all posts for a User   - GET /users/{user_id}/posts
 - Create a post for a User        - POST /users/{user_id}/posts
 - Retrieve details of a post      - GET /users/{user_id}/posts/{post_id}
