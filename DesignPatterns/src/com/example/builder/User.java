package com.example.builder;

public class User {
    private final String userId;
    private final String username;
    //optional
    private final String emailId;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        this.emailId = builder.emailId;
        //initialise here
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userId='").append(userId).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", emailId='").append(emailId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailId() {
        return emailId;
    }

    //Builder class
    static class UserBuilder {
        private String userId;
        private String username;
        //optional
        private String emailId;


        public UserBuilder() {
        }

        public static UserBuilder builder(){
                return new UserBuilder();
        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
