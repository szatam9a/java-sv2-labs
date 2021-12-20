package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides() {
        return 4;
    }
    default double getLengthOfDiagonal(){
        return Math.sqrt(getSide()*getSide());
    }
    default double getPerimeter(){
        return getSide()*4;
    }
    default double getArea(){
        return getSide()*getSide();
    }
    double getSide();
}
