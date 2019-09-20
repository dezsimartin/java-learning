package hu.flowacademy.twitter;

import twitter4j.User;

public class Tweet {
    private String created_at;
    private String id_str;
    private String text;
    private User user;

    Tweet(){
    }

    public Tweet(String created_at, String id_str, String text, User user) {
        this.created_at = created_at;
        this.id_str = id_str;
        this.text = text;
        this.user = user;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
