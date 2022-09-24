public class Pedido {
   
    private enum Status {
        PROCESSANDO, CANCELADO, ENVIADO
    };
    private Status status;
    // outros atributos


    public void alterar() {
        switch (status) {
            case PROCESSANDO:
                // código para alteração do pedido
                break;
            case CANCELADO:
                String msg1 = "Não é possivel realizar alterações" +
                        "pois o pedido foi cancelado";
                throw new IllegalStateException(msg1);
            case ENVIADO:
                String msg2 = "Não é possivel realizar alterações" +
                        "pois o pedido já foi enviado";
                throw new IllegalStateException(msg2);
        }
    }

    public void cancelar() {
        switch (status) {
            case PROCESSANDO:
                // Código para cancelamento do pedido
                status = Status.CANCELADO;
                break;
            case CANCELADO:
                String msg1 = "O pedido já foi cancelado";
                throw new IllegalStateException(msg1);
            case ENVIADO:
                String msg2 = "Não é possivel cancelar" +
                        "pois o pedido já foi enviado";
                throw new IllegalStateException(msg2);
        }
    }

    public void enviar() {
        switch (status) {
            case PROCESSANDO:
                // código para envio do pedido
                status = Status.ENVIADO;
                break;
            case CANCELADO:
                String msg1 = "Não é possivel enviar" +
                        "pois o pedido foi cancelado";
                throw new IllegalStateException(msg1);
            case ENVIADO:
                String msg2 = "O pedido já foi enviado";
                throw new IllegalStateException(msg2);
        }
    }

}