import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Square[] quadrati = new Square[4];
        Point punto = null;
        int lato;
        int x ;
        int y;
        int i;
        BufferedReader tastiera;
        tastiera=new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < quadrati.length; i++) {
            System.out.println("inserisci xpunto"+i);
            x=Integer.parseInt(tastiera.readLine());

            System.out.println("inserisci ypunto"+i);
            y=Integer.parseInt(tastiera.readLine());

            System.out.println("inserisci lato"+i);
            lato=Integer.parseInt(tastiera.readLine());

            quadrati[i] = new Square(punto = new Point(x, y), lato);

        }



        int offset;




        for (i = 0; i < quadrati.length; i++) {

            System.out.println("inserisci offsetX");
            tastiera=new BufferedReader(new InputStreamReader(System.in));
            offset=Integer.parseInt(tastiera.readLine());
            quadrati[i].spostaQuadratoX(offset);


        }
        for (i = 0; i < quadrati.length; i++) {
            System.out.println("inserisci offsetY");
            tastiera=new BufferedReader(new InputStreamReader(System.in));
            offset=Integer.parseInt(tastiera.readLine());
            quadrati[i].spostaQuadratoY(offset);


        }
        boolean bool;

        System.out.println("inserisci offsetX");
        tastiera=new BufferedReader(new InputStreamReader(System.in));
        offset=Integer.parseInt(tastiera.readLine());
        bool= punto.spostaVerticale(offset);

        System.out.println("inserisci offsetX");
        tastiera=new BufferedReader(new InputStreamReader(System.in));
        offset=Integer.parseInt(tastiera.readLine());
        bool= punto.spostaOrizzontale(offset);


        for(i=0;i< quadrati.length;i++) {
            System.out.println("inserisci xpunto" + i);
            x = Integer.parseInt(tastiera.readLine());

            System.out.println("inserisci ypunto" + i);
            y = Integer.parseInt(tastiera.readLine());
            Point puntoD = new Point(x, y);
            bool = quadrati[i].puntoDentroQuadrato(puntoD);
        }

    }
}