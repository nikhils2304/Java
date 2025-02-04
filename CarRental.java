class CarRental {
    private int CarId;
    private String CarType;
    private float Rent;

    public void GetCar(int id, String type) {
        this.CarId = id;
        this.CarType = type;

        switch (type.toLowerCase()) {
            case "small car":
                this.Rent = 1000;
                break;
            case "van":
                this.Rent = 800;
                break;
            case "suv":
                this.Rent = 2500;
                break;
            default:
                this.Rent = 0;
                System.out.println("Invalid car type entered.");
        }
    }

    public float GetRent() {
        return Rent;
    }

    public void ShowCar() {
        if (Rent == 0) {
            System.out.println("Car details are not valid.");
        } else {
            System.out.println("Car ID: " + CarId);
            System.out.println("Car Type: " + CarType);
            System.out.println("Rent: " + Rent);
        }
    }

    public static void main(String[] args) {
        CarRental car = new CarRental();
        car.GetCar(101, "SUV");
        System.out.println("Rent: " + car.GetRent());
        car.ShowCar();
    }
}