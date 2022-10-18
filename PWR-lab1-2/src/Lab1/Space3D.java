package Lab1;

public class Space3D extends  Space2D{
    double z;

    public Space3D () {
        super();
        this.z = 0;
    }

    public Space3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void wyswietlWspolrzednePunktu (){
        System.out.println("wpsolrzedne punktu: (" + this.x + ", " + this.y + ", "+ this.z +")");
    }
    @Override
    public String toString() {
        return super.toString() + ", " + this.z;
    }
    public static double obliczOdlegloscMiedzyPunktami(Space3D A, Space3D B){
        return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2) + Math.pow(A.z - B.z,2) );

    }

    public double obliczOdlegloscOdPoczatkuUkladu (){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public static double obwodTrojkata (Space3D A, Space3D B, Space3D C){
        return obliczOdlegloscMiedzyPunktami(A,B) + obliczOdlegloscMiedzyPunktami(B,C) + obliczOdlegloscMiedzyPunktami(A,C);
    }

    public static double poleTrojkata (Space3D A, Space3D B, Space3D C){
        double a = obliczOdlegloscMiedzyPunktami(A,B);
        double b = obliczOdlegloscMiedzyPunktami(B,C);
        double c = obliczOdlegloscMiedzyPunktami(A,C);
        double p = obwodTrojkata(A, B, C)/ 2;
        double pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return pole;
    }




}
