class TomCat extends Fighter {
    public TomCat(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void refuel() {
        System.out.println(getPlaneID() + " - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }
}
