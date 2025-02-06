/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ELOHOME LTD
 */
@Setter
@Getter
@Entity
public class Post {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String content;
    private Date createdAt;

    // Additional attributes as needed

    @ManyToOne
    private DiscussionForum discussion;

    @ManyToOne
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
    
    
}
