package ru.arnis.designpatterns.Strategy_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public class Data {
    private String postTitle;
    private int postID;
    private String postText;

    public Data(String postTitle, int postID, String postText) {
        this.postTitle = postTitle;
        this.postID = postID;
        this.postText = postText;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}
