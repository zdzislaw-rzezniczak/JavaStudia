package Lab1;

public class Main {

    public static void main(String[] args) {

        Space2D pkt1 = new Space2D(5, 6);
        Space2D pkt2 = new Space2D(5, 10);
        Space2D pkt3 = new Space2D(9, 12);
        pkt1.wyswietlWspolrzednePunktu();
        System.out.println(pkt1.obliczOdlegloscOdPoczatkuUkladu());
        System.out.println(pkt1);
        System.out.println("obwód trójkąta: " + Space2D.obwodTrojkata(pkt1, pkt2, pkt3));
        System.out.println("pole trojkata " + Space2D.poleTrojkata(pkt1, pkt2, pkt3));

        Space3D pkt3D1 = new Space3D(4, 5,6);
        Space3D pkt3D2 = new Space3D(10, 5,6);
        Space3D pkt3D3 = new Space3D(4, 3,2);
        pkt3D1.wyswietlWspolrzednePunktu();
        System.out.println(Space3D.obliczOdlegloscMiedzyPunktami(pkt3D1, pkt3D2));
        System.out.println(pkt3D3.obliczOdlegloscOdPoczatkuUkladu());
        System.out.println("obwod trojkata w ukladzie 3d " + Space3D.obwodTrojkata(pkt3D1,pkt3D2, pkt3D3));
        System.out.println("Pole trojkata w ukladzie 3d " + Space3D.poleTrojkata(pkt3D1,pkt3D2, pkt3D3));



    }
}
