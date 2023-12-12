public class Square {
    private Point punto;
    private int lato;

    public Square(Point punto, int lato) {
        this.punto = punto;
        this.lato = lato;
    }
    public Square(){
        punto=new Point();
        lato=1;

    }
    public boolean spostaQuadratoX(int offset){

        punto.setX(punto.getX()-offset);

        return true;
    }
    public boolean spostaQuadratoY(int offset){

        punto.setY(punto.getY()-offset);

        return true;
    }
    public boolean puntoDentroQuadrato(Point punto){
        if(this.punto.getX()< punto.getX() && this.punto.getY()<punto.getY() && this.punto.getX()+lato>= punto.getX() && this.punto.getY()+lato>= punto.getY()){
            return true;
        }
        else{
            return false;
        }
    }


}
