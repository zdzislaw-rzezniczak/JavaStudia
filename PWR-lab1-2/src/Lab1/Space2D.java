package Lab1;

public class Space2D {
    double x;
    double y;

    public Space2D (){
        this.x = 0;
        this.y = 0;
    }
    public Space2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void wyswietlWspolrzednePunktu (){
        System.out.println("wpsolrzedne punktu: (" + this.x + ", " + this.y + ")");
    }


    public static double obliczOdlegloscMiedzyPunktami(Space2D A, Space2D B){
        return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));

    }
    public double obliczOdlegloscOdPoczatkuUkladu (){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    @Override
    public String toString() {
        return "To jest punkt zdefiniowany przez użytkownika: " + this.x + "," + this.y;
    }

    public static double obwodTrojkata (Space2D A, Space2D B, Space2D C){
        return obliczOdlegloscMiedzyPunktami(A,B) + obliczOdlegloscMiedzyPunktami(B,C) + obliczOdlegloscMiedzyPunktami(A,C);
    }
    public static double poleTrojkata (Space2D A, Space2D B, Space2D C){
        double a = obliczOdlegloscMiedzyPunktami(A,B);
        double b = obliczOdlegloscMiedzyPunktami(B,C);
        double c = obliczOdlegloscMiedzyPunktami(A,C);
        double p = obwodTrojkata(A, B, C)/ 2;
        double pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return pole;
    }



}
