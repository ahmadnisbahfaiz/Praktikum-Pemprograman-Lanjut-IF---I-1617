package Inheriten;
public class SoftwareEngineer extends Latihan {
    private long bonus = 5500000;
    private long tunjangan = 300000;

    public SoftwareEngineer(int PriodeKerja) {
        super(PriodeKerja);
    }   
    public long getBonus() {
        return bonus + super.getBonusPerBulan();
    }
    public long getTunjangan() {
        return tunjangan;
    }      
    public long gajiTotal1(){
        return getGaji() + getTunjangan() + getBonus();
    }
}
    
    
   
