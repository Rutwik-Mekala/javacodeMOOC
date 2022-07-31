public class Timer {
    private ClockHand hundrethseconds;
    private ClockHand seconds;
    public Timer(){
        this.hundrethseconds = new ClockHand(100);
        this.seconds=new ClockHand(60);
    }
    public String toString(){
        return seconds+":"+hundrethseconds;
    }
    public void advance(){
        this.hundrethseconds.advance();
        if(this.hundrethseconds.value()==0){
            this.seconds.advance();
        }
    }
}
