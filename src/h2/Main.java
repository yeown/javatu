package h2;

class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
        int[] carGas = {10, 20, 15, 17};

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(carNames[i], carGas[i]);
        }

        for (int i = 0; i < 7; i++) {
            for(int j = 0; j < 4; j++) {
                if(cars[j].move(5)>=0) {
                    System.out.println(cars[j].getCarName()+" move, resume gas: "+cars[j].getGas());
                }
                else{
                    System.out.println(cars[j].getCarName()+" out of gas, resume gas: "+ cars[j].getGas());
                    System.out.println("fuel amount: 10, resume fuel: "+cars[j].refuel(10));
                }
                System.out.println();
            }
        }
    }
}