public class Car {

    String carModel;
    String carColor;
    int numOfWheels;

    // constructor
    public Car() {
    }

    // constructor
    public Car(String carModel, String carColor) {
        this.carModel = carModel;
        this.carColor = carColor;
    }

    // constructor
    public Car(String carModel, String carColor, int numOfWheels) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.numOfWheels = numOfWheels;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
}
