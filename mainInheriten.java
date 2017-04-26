package Inheriten;
public class mainInheriten {
    public static void main(String []args){
        SoftwareEngineer S1 = new SoftwareEngineer(7);
        ProjectManager S2 = new ProjectManager(13);
        System.out.println("Gaji Software Engineer : "+S1.gajiTotal1());
        System.out.println("Gaji Project Manager : "+S2.getgajiTotal2());
    }
}
