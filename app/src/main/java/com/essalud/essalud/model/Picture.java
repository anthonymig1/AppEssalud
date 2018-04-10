package com.essalud.essalud.model;

public class Picture {
    private int picture;
    private String textup;
    private String textbottom;
    private int icon;
    private int color;
    private int transparentcolor;
    private int contrastcolor;

    public Picture(int picture, String textup, String textbottom, int icon, int color, int transparentcolor, int contrastcolor) {
        this.picture = picture;
        this.textup = textup;
        this.textbottom = textbottom;
        this.icon = icon;
        this.color = color;
        this.transparentcolor = transparentcolor;
        this.contrastcolor = contrastcolor;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTextup() {
        return textup;
    }

    public void setTextup(String textup) {
        this.textup = textup;
    }

    public String getTextbottom() {
        return textbottom;
    }

    public void setTextbottom(String textbottom) {
        this.textbottom = textbottom;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTransparentcolor() {
        return transparentcolor;
    }

    public void setTransparentcolor(int transparentcolor) {
        this.transparentcolor = transparentcolor;
    }

    public int getContrastcolor() {
        return contrastcolor;
    }

    public void setContrastcolor(int contrastcolor) {
        this.contrastcolor = contrastcolor;
    }
}
