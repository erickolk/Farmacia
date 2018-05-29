/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

public class ItemRemedio {
    private Remedio remedio;
    private int quantidade;
    private int quantidade_entregue;

    public ItemRemedio(Remedio remedio, int quantidade, int quantidade_entregue) {
        this.remedio = remedio;
        this.quantidade = quantidade;
        this.quantidade_entregue = quantidade_entregue;
    }

    public Remedio getRemedio() {
        return remedio;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_entregue() {
        return quantidade_entregue;
    }

    public void setQuantidade_entregue(int quantidade_entregue) {
        this.quantidade_entregue = quantidade_entregue;
    }
    
    
}
