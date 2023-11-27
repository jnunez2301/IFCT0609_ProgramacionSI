package com.corenetworks.ejemplo3.modelo;

public class TareaImpresion implements Runnable{
    private Impresora impresora;
    private String documento;

    public TareaImpresion(Impresora impresora, String documento) {
        this.impresora = impresora;
        this.documento = documento;
    }

    @Override
    public void run() {
        impresora.imprimirDocumento(documento);
    }
}
