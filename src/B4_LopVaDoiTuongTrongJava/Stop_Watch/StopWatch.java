package B4_LopVaDoiTuongTrongJava.Stop_Watch;

public class StopWatch {

    private  long startTime;
    private  long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public long getStartTime(){
        return this.startTime;
    }
    public void end(){
        this.endTime=System.currentTimeMillis();
    }
    public long getEndTime(){
        return this.endTime;
    }
    public long getElapsedTime(){
        return (this.endTime-this.startTime);
    }
}
