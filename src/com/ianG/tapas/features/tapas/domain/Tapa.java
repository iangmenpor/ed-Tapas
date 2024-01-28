package com.ianG.tapas.features.tapas.domain;

public class Tapa {
    private String code;
    private String name;
    private String establishment;
    private String points;
    private String averagePoints;
    private String numberParticipants;
    private String totalPoints;
    private String ingredients;

    //-CONSTRUCTOR
    public Tapa(String code, String name, String establishment, String points, String averagePoints, String numberParticipants, String totalPoints, String ingredients) {
        this.code = code;
        this.name = name;
        this.establishment = establishment;
        this.points = points;
        this.averagePoints = averagePoints;
        this.numberParticipants = numberParticipants;
        this.totalPoints = totalPoints;
        this.ingredients = ingredients;
    }

    //-GETTERs & SETTERS

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        this.establishment = establishment;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getAveragePoints() {
        return averagePoints;
    }

    public void setAveragePoints(String averagePoints) {
        this.averagePoints = averagePoints;
    }

    public String getNumberParticipants() {
        return numberParticipants;
    }

    public void setNumberParticipants(String numberParticipants) {
        this.numberParticipants = numberParticipants;
    }

    public String getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    //-ToString

    @Override
    public String toString() {
        return "Tapa{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", establishment='" + establishment + '\'' +
                ", points='" + points + '\'' +
                ", averagePoints='" + averagePoints + '\'' +
                ", numberParticipants='" + numberParticipants + '\'' +
                ", totalPoints='" + totalPoints + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
