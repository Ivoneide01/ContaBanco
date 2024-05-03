import java.util.Scanner;

public class ContaTerminal {
    private String nomeDoCliente;
    private int numero;
    private String agencia;
    private double saldo;

    public ContaTerminal(String nomeDoCliente, int numero, String agencia, double saldo) {
        this.nomeDoCliente = "MARIO ANDRADE";
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        String agencia;
        boolean agenciaValida = false;

        // Loop para solicitar a agência até que o formato seja correto
        do {
            System.out.println("Por favor, digite o número da agência (no formato XXX-Y):");
            agencia = scanner.next();

            // Verifica se a agência está no formato correto XXX-Y
            if (agencia.matches("\\d{3}-\\d")) {
                agenciaValida = true;
            } else {
                System.out.println("Formato da agência incorreto. Por favor, insira no formato XXX-Y.");
            }
        } while (!agenciaValida);

        

        System.out.println("Por favor, digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal("MARIO ANDRADE", numero, agencia, saldoInicial);

        System.out.println("Olá " + conta.getNomeDoCliente() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo R$"
                + conta.getSaldo() + " já está disponível para saque.");

        

        scanner.close();
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
