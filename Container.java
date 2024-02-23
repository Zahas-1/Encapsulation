public class Container {
    //Declare instance variable
    private int container;

    //Initialise container constructor to int 0
    public Container(){
        this.container = 0;

    }
    //Define method to return current value of container
    public int contains(){
        return this.container;
        }

    //Define method to add to the container, preventing a negative container value
    public void add(int amount) {
        if (amount > 0) {
            this.container = Math.min(this.container + amount, 100);
        }
    }
    //Define method to remove from the container, preventing a negative container value
    public void remove(int remove) {
        if (remove > 0) {
            this.container = Math.max(this.container - remove, 0);
        }
    }
    //Define toString method to return the value of the container out of the maximum of 100
    public String toString(){
        return this.container + "/100";
    }

    //Test code
    public static void main(String[] args){
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);
    }
}
