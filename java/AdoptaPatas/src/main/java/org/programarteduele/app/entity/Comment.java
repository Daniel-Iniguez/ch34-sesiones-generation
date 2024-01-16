package org.programarteduele.app.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_comment")
public class Comment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "content")
    private String commentContent;

    @Column(name = "date_posted" ,columnDefinition="DATETIME DEFAULT CURRENT_TIMESTAMP", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    //Muchos comentarios pueden ser hechos por un usuario
    @ManyToOne() 
    @JoinColumn(name = "comment_user_id")
    private User user;

    //Muchos comentarios pueden ser hechos en una publicación 
    @ManyToOne() 
    @JoinColumn(name = "source_post_id")
    @JsonIgnore
    private Post post;

    // Un comentario puede tener muchos likes 
    @OneToMany(mappedBy = "comment")
    private List<CommentLike> commentLikes;


}
