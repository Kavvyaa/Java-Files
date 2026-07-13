package OOPs;

public class interfaces {
    public static void main(String args[]){
        queen q = new queen();
        q.moves();
    }    
}

interface chessPlayer {
    void moves();
}

class queen implements chessPlayer{
    public void moves(){
        System.out.println("queen moves");
    }
}

class pawn implements chessPlayer{
    public void moves(){
        System.out.println("pawn moves");
    }
}

class king implements chessPlayer{
    public void moves(){
        System.out.println("king moves");
    }
}