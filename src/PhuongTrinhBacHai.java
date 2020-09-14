public class PhuongTrinhBacHai {
    private double a, b, c;

    public PhuongTrinhBacHai(){

    }
    public PhuongTrinhBacHai(double a,double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getFirstDegreeEquation(){
        double r = -(this.c)/this.b;
        return r;
    }
    public double getDoubleSolution(){
        double r = -(this.b)/(2*this.a);
        return r;
    }

    public double getDiscriminant(){
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    public double  getRoot1(){
        double r1 = (-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
        return r1;
    }
    public double  getRoot2(){
        double r2 = (-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
        return r2;
    }


}
