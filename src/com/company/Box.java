package com.company;

public class Box {
private int length;
private int width;
private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
// Public class  доступен в maine  но Privat class доступен только внутри
    // но из мейна он не будет доступен !!!!!!!
    public int getVolume() {
        return this.getLength() * this.getHeight() * this.getWidth();
    }

    @Override
    public String toString() {
        return "Box{" +
                "length " + length + "\n" +
                ", width " + width + "\n" +
                ", height " + height + "\n" +
                ", Volume " + this.getVolume() +
                " isCube " + this.isCube() +
                '}';
    }
public boolean isCube(){
        boolean result = false;
        if (length == width && width == height){
            result = true;
        }
        return result;
}
public boolean isValid(){
        //TODO insert logic.
        return false;
}

}
