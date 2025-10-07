public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldoInicial) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldoInicial;
    }

    public void sacar(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Matheus", 12345, 1000);

        conta.mostrarSaldo();
        conta.sacar(200);
        conta.depositar(150);
        conta.sacar(2000);
        conta.mostrarSaldo();
    }
}
