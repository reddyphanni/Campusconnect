**Controllers**

All the classes are annotated with @Controller and @RestController so that they can be scanned by spring MVC

- Connectcontroller.java : Contains MVC controller methods for basic navigation.
- Blogcontroller : Contains RestWebServices related to Blog.
- forumcontroller: Contains RestWebServices related to Forum.
- fcommentcontroller:Contains RestWebServices related to ForumComments.
- BlogRating : Contains RestWebServices related to BlogRating.
- Usercontroller : Contains RestWebServices related to Users.

**Models**

Contains all model classes.These models will be scanned by hibernate, so as to facilitate easy data manipulation using Hibernate ORM.

- Blog.java
- BlogRating.java
- Forum.java
- Forumcomments.java
- Userdetails.java
- message.java
- OutputMessage.java

**DAO**

Contains all DAO interfaces and DAOImpls containing RAW persistence Logic.

- BlogRatingDAO.java
- BlogRatingdaoimpl.java
- Blogdao.java
- Blogdaoimpl.java
- Forumdao.java
- Forumdaoimpl.java
- ForumCommentsdao.java
- ForumCommentsdaoimpl.java
- Usersdao.java
- Usersdaoimpl.java

**Service**

Contains all service interfaces with are accessed from Controllers and ServiceImpl containing business logic.

- BlogRatingService.java
- BlogRatingServiceImpl.java
- Blogservicedao.java
- BlogServicedaoImpl.java
- Forumservicedao.java
- Forumservicedaoimpl.java
- Forumcommentservicedao.java
- ForumcommentserviceImpl.java
- Usersservicedao.java
- Usersservicedaoimpl.java
