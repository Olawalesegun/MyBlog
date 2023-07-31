package data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commentId;
    @Column(nullable = false)
    private String comment;
    @Column(nullable = false)
    private String postId;
    @Column(nullable = false)
    private String userId;
}
