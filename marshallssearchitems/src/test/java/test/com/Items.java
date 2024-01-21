/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

/**
 *
 * @author Natalia
 */
public class Items {
    private String Items;

    public Items(String Items) {
        this.Items = Items;
    }

    @Override
    public String toString() {
        return "Items{" + "Items=" + Items + '}';
    }

    public String getItems() {
        return Items;
    }

    public void setItems(String Items) {
        this.Items = Items;
    }
    
}
