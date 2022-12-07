package Flower;

public class Visual {

    private String color;
    private String leafColor;
    private String size;

    @Override
    public String toString() {
        return "Visual{" +
                "color='" + color + '\'' +
                ", leafColor='" + leafColor + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public String getSize() {
        return size;
    }

    public Visual() {

    }
}
