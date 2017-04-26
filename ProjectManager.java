package Inheriten;
public class ProjectManager extends Latihan {
    private long bonus = 450000;
    private long tunjangan = 6000000;
    private long apresiasi;
    
    public ProjectManager(int PriodeKerja) {
        super(PriodeKerja);
    }

    public long getBonus() {
        return bonus + super.getBonusPerBulan();
    }

    public long getTunjangan() {
        return tunjangan;
    }

    public long getApresiasi() {
        if (getPriodeKerja() > 10){
            return 700000;
        }else {
            return 225000;
        }
    }
    public long getgajiTotal2(){
        return getBonus() + getApresiasi() + getGaji() + getTunjangan();
    }
}
