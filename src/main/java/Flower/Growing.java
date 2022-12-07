package Flower;

public class Growing {
    private String temp;
    private boolean light;

    public Growing() {

    }

    @Override
    public String toString() {
        return "Growing{" +
                "temp='" + temp + '\'' +
                ", light=" + light +
                '}';
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public String getTemp() {
        return temp;
    }

    public boolean setLight() {
        return light;
    }
}
