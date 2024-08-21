package com.teste;

public class SimuladorCashBack {
    /**
     * Calcula o valor de cashback baseado no valor da compra e no grau de
     * fidelidade do cliente.
     * 
     * @param valorCompra    o valor total da compra
     * @param grauFidelidade o grau de fidelidade do cliente (Bronze, Prata,
     *                       Ouro)
     * @return o valor de cashback calculado
     */
    public static double calculaCashBack(double valorCompra, String grauFidelidade) {
        double cashbackAdicional = 0;
        double valorCashback = 0;

        switch (grauFidelidade) {
            case "Prata":
                cashbackAdicional = 0.05;
                break;

            case "Ouro":
                cashbackAdicional = 0.1;
                break;

            case "Bronze":
            default:
                break;
        }

        if (valorCompra < 99) {
            valorCashback = valorCompra * (0.05 + cashbackAdicional);
        } else if (valorCompra <= 500) {
            valorCashback = valorCompra * (0.10 + cashbackAdicional);
        } else {
            valorCashback = valorCompra * (0.15 + cashbackAdicional);
        }

        return valorCashback;
    }
}