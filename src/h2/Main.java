package h2;

class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
        int[] carGas = {10, 20, 15, 17};
        int[] regas = carGas;

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(carNames[i], carGas[i]);
        }

        for (int i = 0; i < 7; i++) {
            for(int j = 0; j < 4; j++) {
                if(cars[j].move(regas[j])>=0) {
                    regas[j] = cars[j].move(regas[j]);
                    System.out.println(carNames[j]+" move, resume gas: "+regas[j]);
                    System.out.printf("\n");
                }
                else{
                    regas[j] = cars[j].move(regas[j])+5;
                    System.out.println(carNames[j]+" out of gas, resume gas: "+ regas[j]);
                    System.out.println("fuel amount: 10, resume fuel: "+cars[j].refuel(regas[j]));
                    regas[j] = cars[j].refuel(regas[j]);
                    System.out.printf("\n");
                }
            }
        }
    }
}

