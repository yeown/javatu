package h2;

public class Car {
    public Car(String carName, int gas) {
        setCarName(carName);
        this.gas = gas;
    }
    void setGas(int gas) {
        this.gas = gas;
    }
    int getGas() {
        return gas;
    }
    void setCarName(String carName) {
        this.carName = carName;
    }
    String getCarName() {
        return carName;
    }
    int gas;
    String carName;

    int move(int gas){
        if(this.gas>=gas){
            setGas(this.gas-gas);
            return getGas();
        }
        else{
            setGas(this.gas);
            return getGas()-gas;
        }
    }
    int refuel(int amount){
        setGas(this.gas + amount);
        return getGas();
    }
}

