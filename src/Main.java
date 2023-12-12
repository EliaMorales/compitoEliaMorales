import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Square[] quadrati = new Square[4];
        Point punto;
        int lato;
        int x;
        int y;
        int i;
        BufferedReader tastiera;
        for (i = 0; i < quadrati.length; i++) {
            System.out.println("inserisci xpunto"+i);
            tastiera=new BufferedReader(new InputStreamReader(System.in));
            x=Integer.parseInt(tastiera.readLine());

            System.out.println("inserisci ypunto"+i);
            tastiera=new BufferedReader(new InputStreamReader(System.in));
            y=Integer.parseInt(tastiera.readLine());

            System.out.println("inserisci lato"+i);
            tastiera=new BufferedReader(new InputStreamReader(System.in));
            lato=Integer.parseInt(tastiera.readLine());

            quadrati[i] = new Square(punto = new Point(x, y), lato);

        }
        boolean bool;


        int offset;

        System.out.println("inserisci offsetY");
        tastiera=new BufferedReader(new InputStreamReader(System.in));
        offset=Integer.parseInt(tastiera.readLine());


        for (i = 0; i < quadrati.length; i++) {

            System.out.println("inserisci offsetX");
            tastiera=new BufferedReader(new InputStreamReader(System.in));
            offset=Integer.parseInt(tastiera.readLine());
            quadrati[i].spostaQuadratoX(offset);


        }
        for (i = 0; i < quadrati.length; i++) {

            System.out.println("inserisci offsetX");
            tastiera=new BufferedReader(new InputStreamReader(System.in));
            offset=Integer.parseInt(tastiera.readLine());
            quadrati[i].spostaQuadratoY(offset);


        }
        bool= punto.spostaVerticale(offset);
        System.out.println("inserisci offsetX");
        tastiera=new BufferedReader(new InputStreamReader(System.in));
        offset=Integer.parseInt(tastiera.readLine());

        bool= punto.spostaOrizzontale(offset);
        System.out.println("inserisci offsetX");
        tastiera=new BufferedReader(new InputStreamReader(System.in));
        offset=Integer.parseInt(tastiera.readLine());

        Point puntoD;
        bool=quadrati[i].puntoDentroQuadrato(puntoD.new Point(x,y));

    }
}