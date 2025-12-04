public class Contribuinte implements CalculadoraTributo {

    protected String nome;
    protected String cpf;
    protected double salarioBruto;

    public Contribuinte (String nome, String cpf, double salarioBruto){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public String getTipo() {
        return "Genérico";
    }



// Anotações para estudos: igual no exemplo do prof porem como aqui não tem valor add o 0
//  usando override - sempre usamos o inicio no maisculo
// sobrescrito nas subclasses igual no exemplo do pokemon

    @Override
    public double calcularINSS() {
        return 0.0;
    }

    @Override
    public double calcularIRPF() {
        return 0.0;
    }

// conta de subtraçõa pega o salário e retira os valores para o cálculo
    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }

    public void exibirResumo(){
        System.out.println("       \nRESUMO         ");
        System.out.println("NOME: " + nome);
        System.out.println("TIPO: " + getTipo());
        System.out.println("CPF: " + cpf);
        System.out.println("SALÁRIO BRUTO: R$ " + salarioBruto);

        System.out.println("\nINSS: R$ " + calcularINSS());
        System.out.println("IRPF: R$ " + calcularIRPF());
        System.out.println("SALÁRIO LÍQUIDO: R$ " + calcularSalarioLiquido());
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }





    // SETTERS
    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setCpf(String cpf) {
        this.cpf=cpf;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto=salarioBruto;
    }



}











  