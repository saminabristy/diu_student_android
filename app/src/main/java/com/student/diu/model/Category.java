package com.student.diu.model;

public class Category {

    private int menuID;
    private String menuTitle;
    private int menuIcon;

    public Category(int menuID, String menuTitle, int menuIcon) {
        this.menuID = menuID;
        this.menuTitle = menuTitle;
        this.menuIcon = menuIcon;
    }

    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public int getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(int menuIcon) {
        this.menuIcon = menuIcon;
    }
}
