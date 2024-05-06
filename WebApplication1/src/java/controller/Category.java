/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author admin
 */
public class Category {
    private int id,Age;
    private String name,Birthplace,Style;
    
    public Category() {
    }
    
    public Category(int id, int Age, String name, String Birthplace, String Style) {
        this.id = id;
        this.Age = Age;
        this.name = name;
        this.Birthplace = Birthplace;
        this.Style = Style;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return Birthplace;
    }

    public void setBirthplace(String Birthplace) {
        this.Birthplace = Birthplace;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", Age=" + Age + ", name=" + name + ", Birthplace=" + Birthplace + ", Style=" + Style + '}';
    }
    
    
}
