public class Cube {
    private int edgelength;
    public Cube(int length){
        this.edgelength = length;
    }
    public int volume(){
        return this.edgelength*this.edgelength*this.edgelength;
    }
    public String toString(){
        return "The length of the edge is "+this.edgelength+" and the volume "+volume();
    }
}
