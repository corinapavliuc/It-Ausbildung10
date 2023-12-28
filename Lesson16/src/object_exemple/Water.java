package object_exemple;

public class Water {

    private int temperature;
    private String condition;
    private boolean salt;

    public Water(int temperature, String condition, boolean salt) {
        this.temperature = temperature;
        this.condition = condition;
        this.salt = salt;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature <= 100 && temperature >= -100) {
            this.temperature = temperature;
        } else {
            System.out.println("Не валидная температура");
        }
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        if (condition == "Жидкая" || condition == "Твёрдая" || condition == "Газообразная") {
            this.condition = condition;
        } else {
            System.out.println("Не валидное агрегатное состояние");
        }
    }

    public boolean isSalt() {
        return salt;
    }

    public void setSalt(boolean salt) {
        this.salt = salt;
    }
}