package br.com.samusics.models;

public class Audio {
    private String title;
    private int totalReproductions = 0;
    private int totalLikes = 0;
    private int classification;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like() {
        this.totalLikes++;
    }

    public void reproduce() {
        this.totalReproductions++;
    }
}
