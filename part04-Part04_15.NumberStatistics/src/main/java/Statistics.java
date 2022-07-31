import java.util.ArrayList;
public class Statistics {
    private int sum;
    private int count;

    public Statistics(){
        this.count=0;
        this.sum=0;
    }
    public void addNumber(int number){
        sum+=number;
        count++;
    }
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    public double average(){
        if(count==0){
            return 0;
        }
        double average = (1.0*sum())/getCount();
        return average;
    }
    public void empty(){
        sum=0;
    }
}
