package Inheriten;
public class Latihan {
    private long gaji = 2500000;
    private int PriodeKerja;
    Latihan (int PriodeKerja){
    this.PriodeKerja =  PriodeKerja;
}
    public long getGaji() {
        return gaji;
    }
    public long getBonusPerBulan() {
        if (getPriodeKerja() > 5){
            return 2500000;
        }else {
            return 0;
        }
    }
    public int getPriodeKerja() {
        return PriodeKerja;
    }
}
