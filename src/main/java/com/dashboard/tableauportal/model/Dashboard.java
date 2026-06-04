package com.dashoard.tableauportal.model;

public class Dashboard {
    private String title;
    private String category;
    private String description;
    private String url;

    public Dashboard(){

    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

     public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

     public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }
    
}
