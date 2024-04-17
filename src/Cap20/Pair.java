package Cap20;

public class Pair <F,S> {
    
    private F first;
    private S second;

    public void SetFirst(F first){
        this.first = first;
    }

    public F getFirst(){
        return first;
    }

    public void SetSecond(S second){
        this.second = second;
    }

    public S getSecond(){
        return second;
    }
}
