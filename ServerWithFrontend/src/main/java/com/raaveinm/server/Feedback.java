package com.raaveinm.server;

public class Feedback {
    private String name;
    private String email;
    private String modelUsed;
    private String rating;
    private String review;
    private String improvements;
    private String features;

    public Feedback() {
        this.name = name;
        this.email = email;
        this.modelUsed = modelUsed;
        this.rating = rating;
        this.review = review;
        this.improvements = improvements;
        this.features = features;
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getModelUsed() {return modelUsed;}
    public String getRating() {return rating;}
    public String getReview() {return review;}
    public String getImprovements() {return improvements;}
    public String getFeatures() {return features;}

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setModelUsed(String modelUsed) { this.modelUsed = modelUsed; }
    public void setRating(String rating) { this.rating = rating; }
    public void setReview(String review) { this.review = review; }
    public void setImprovements(String improvements) { this.improvements = improvements; }
    public void setFeatures(String features) { this.features = features; }

}