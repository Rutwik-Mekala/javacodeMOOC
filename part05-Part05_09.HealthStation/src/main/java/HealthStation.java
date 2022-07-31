
public class HealthStation {
    private int weighTimes;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighTimes++;
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    public int weighings(){
        return this.weighTimes;
    }

}
