package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class entregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "00000000";
        //Dados do endereço

        Cliente cliente = new Cliente();

        //Dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");

        }catch (Exception e){
            System.err.println("Houve um erro ao adicionar o endereço! \n" + e.getMessage());
        }

    }
}
