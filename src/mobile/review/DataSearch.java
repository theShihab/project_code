/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.review;

/**
 *
 * @author User
 */
public class DataSearch {
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public boolean isStory(){
        return story;
    }
    
    public void setStory(boolean story){
        this.story = story;
    }
    
    public DataSearch(String text, boolean story){
        this.text = text;
        this.story = story;
    }
    
    public DataSearch(){}
    
    private  String text;
    private  boolean story;
    
}
