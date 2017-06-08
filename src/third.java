/**
 * Created by RICK on 9/6/2017.
 */
public class third {

    long startTime;
    long stopTime;

    public third() {
        this.startTime = System.currentTimeMillis();
    }

    public long calcTime(){
        return this.stopTime == 0 ? 0 : this.stopTime - this.startTime;
    }

    public void reset(){
        this.startTime = 0 ;
        this.stopTime = 0 ;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.stopTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "third{" +
                "startTime=" + startTime +
                ", stopTime=" + stopTime +
                ", elapseTime=" + calcTime() +
                '}';
    }

}
