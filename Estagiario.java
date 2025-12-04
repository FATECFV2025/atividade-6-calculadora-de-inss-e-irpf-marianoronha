public class Estagiario extends Contribuinte{

    public Estagiario(String nome,String cpf, double salarioBruto ){
        super(nome,cpf,salarioBruto);
    }

    @Override
    public String getTipo() {
        return "Estagiario";
    }

// Anotações: aqui é zero pq os estagiarios não pagam INSS e IRPF
    @Override
    public double calcularINSS(){
        return 0.0;

    }

     @Override
    public double calcularIRPF(){
        return 0.0;

    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }




    
}