package nghia.codegym.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int vote;

    private String author;

    private String feedback;

    @Column(name="liked", nullable = false)
    private int liked = 0;

    @ManyToOne
    @JoinColumn(name = "picture_id")
    private Picture picture;

    public Feedback() {
    }

    public Feedback(Integer id, int vote, String author, String feedback, int liked, Picture picture) {
        this.id = id;
        this.vote = vote;
        this.author = author;
        this.feedback = feedback;
        this.liked = liked;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}
