public class Math {

    public double sum(double x, double y){
        return x+y;
    }

    public double sum(double x, double y, double z){
        return x+y+z;
    }

    public double sum(double v, double x, double y, double z){
        return x+y+z+v;
    }

    public double min(double x, double y){
        return x-y;
    }

    public double min(double x, double y, double z){
        return x-y-z;
    }

    public double min(double v, double x, double y, double z){
        return x-y-z-v;
    }

    public double mult(double x, double y){
        return x*y;
    }
    public double mult(double x, double y, double z){
        return x*y*z;
    }

    public double mult(double v, double x, double y, double z){
        return x*y*z*v;
    }
}
