package ec.edu.utpl.poo.grupal;

public class Cuenta {
    private double saldo;

    public Cuenta() {
        saldo = 0;
        contCuenta++;
    }

    public Cuenta(double saldoC) {
        validarValor(saldoC);
        saldo = saldoC;
        contCuenta++;
    }

    public void depositar(double valor) {
        validarValor(valor);
        saldo += valor;
    }


    public void retirar(double valorR) {
        validarValor(valorR);
        if (valorR > saldo) {
            throw new IllegalArgumentException("No se puede retirar cantidad mayor al saldo");
        }
        saldo -= valorR;
    }

    String getSaldo() {
        return String.format("%.2f", saldo);
    }

    public void validarValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("No se pueden ingresar valores negativos");
        }
    }

    public static int contCuenta;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}