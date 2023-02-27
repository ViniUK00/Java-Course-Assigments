public class Wall {
    // write your code here
    private double width;
    private double height;

    // constructor no-arg
    public Wall() {
        System.out.println("Calling constructor with no arguments.");
    }

    // constructor with 2 args
    public Wall(double width, double height){
        if (width<0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height<0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getters
    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    // setters
    public void setWidth(double width){
        if (width<0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height){
        if (height<0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // area calculation
    public double getArea(){
        return(this.width*this.height);
    }

}
