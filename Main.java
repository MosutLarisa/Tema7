public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Boeing("Boeing747", 10000, 300);
        Airplane a2 = new Concorde("Concorde1", 15000, 100);
        Airplane a3 = new Mig("Mig29", 20000);
        Airplane a4 = new TomCat("F14", 25000);
        
        Boeing boe = (Boeing) a1;
        Concorde con = (Concorde) a2;
        Mig mi = (Mig) a3;
        TomCat tc = (TomCat) a4;
        
        boe.takeOff();
        boe.fly();
        boe.land();
        boe.getMaxPassengers();
        
        con.takeOff();
        con.goSuperSonic();
        con.goSubSonic();
        con.fly();
        con.land();
        con.getMaxPassengers();

        mi.takeOff();
        mi.highSpeedGeometry();
        mi.normalGeometry();
        mi.launchMissile();
        mi.fly();

        tc.takeOff();
        tc.fly();
        tc.refuel();
        tc.land();
    }
}
