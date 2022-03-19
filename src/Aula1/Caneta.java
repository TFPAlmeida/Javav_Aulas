package Aula1;

public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ponta=" + ponta +
                ", carga=" + carga +
                ", tampada=" + tampada +
                '}';
    }

    public void escrever(){
        if(this.tampada){
            System.out.println("Erro! Não posso escrever");
        }else{
            System.out.println("Estou a escrever");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public static void main(String[] args) {

        Caneta c1 = new Caneta("Bic","Azul",0.5f,50);
        c1.tampar();
        System.out.println(c1.toString());
        c1.escrever();
    }
}
