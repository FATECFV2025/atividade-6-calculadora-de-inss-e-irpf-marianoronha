public class PrestadorServico extends Contribuinte{

    public PrestadorServico(String nome,String cpf, double salarioBruto ){
        super(nome,cpf,salarioBruto);
    }

    @Override
    public String getTipo() {
        return "Prestador de Serviço";
    }

// Anotações: valores ficticios para o exemplo
    @Override
    public double calcularINSS(){
        return salarioBruto * 0.25;

    }

     @Override
    public double calcularIRPF(){
        return salarioBruto * 0.14;

    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }




    
}