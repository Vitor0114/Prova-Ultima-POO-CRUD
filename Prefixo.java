public class Prefixo<S, N extends Number>{

    private S txt;
    private N num;

    public Prefixo(S txt, N num) {

        this.txt  = txt;
        this.num = num;
    }

    @Override
    public String toString() { 
        return " | Letras: " + txt + " | Números: " + num + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Prefixo<S, N> prefixo = (Prefixo<S, N>) o;
        if(this.num.equals(prefixo.num) && this.txt.equals(prefixo.txt)){
            return true;
        }
        return false;
    }


    

}
