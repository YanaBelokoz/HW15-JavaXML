package Flower;

public class Flower {

    private Growing growing;
    private Visual visual;
    private String soil;
    private String name;
    private String origin;
    private String multiplying;

    public void setGrowing(Growing growing) {
        this.growing = growing;
    }

    public void setVisual(Visual visual) {
        this.visual = visual;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    public Growing getGrowing() {
        Growing Growing = null;
        return Growing;
    }

    public Visual visual() {
        return visual;
    }

    public String getSoil() {
        return soil;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getMultiplying() {
        return multiplying;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "growing=" + growing +
                ", visual=" + visual +
                ",soil='" + soil + '\'' +
                ", name='" + name + '\'' +
                ", multiplying='" + multiplying + '\'' +
                '}';
    }

    public Flower() {

    }


}
