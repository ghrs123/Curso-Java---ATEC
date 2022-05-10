public enum Ordem {
    
    DUQUE(0), TERNO(0), QUADRA(0), QUINA(0), SENA(0), DAMA(2), VALETE(3), REI(4), SETE(10), AS(11);
    
    private int pontos;
    
    private Ordem(int pontos) {
        this.pontos=pontos;
    }
    
    public int getPontos() {
        return pontos;
    }



}
 

//public enum Ordem {
//
//
//    DUQUE(0), TERNO(0), QUADRA(0), QUINA(0), SENA(0), DAMA(2), VALETE(3), REI(4), SETE(10), AS(11);
//
//
//    private int pontos;
//
//
//    private Ordem(int pontos) {
//
//        this.pontos=pontos;
//
//    }
//
//
//    public int getPontos() {
//
//        return pontos;
//
//    }
//
//}