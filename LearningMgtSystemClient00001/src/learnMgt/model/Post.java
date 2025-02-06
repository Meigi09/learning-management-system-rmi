/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.sql.Date;

/**
 *
 * @author ELOHOME LTD
 */

public class Post {

    private Long postId;
    private String content;
    private Date createdAt;

    private DiscussionForum discussion;

    private Users user;

    public Post() {
    }

    public Post(Long postId, String content, Date createdAt, DiscussionForum discussion, Users user) {
        this.postId = postId;
        this.content = content;
        this.createdAt = createdAt;
        this.discussion = discussion;
        this.user = user;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public DiscussionForum getDiscussion() {
        return discussion;
    }

    public void setDiscussion(DiscussionForum discussion) {
        this.discussion = discussion;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
}
