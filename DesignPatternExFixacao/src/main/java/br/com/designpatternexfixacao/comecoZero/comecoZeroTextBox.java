package br.com.designpatternexfixacao.comecoZero;

import br.com.designpatternexfixacao.abstrasctFactory.TextBox;

public class comecoZeroTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Começou doZero TextBox!");
    }

}
