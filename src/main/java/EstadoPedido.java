public enum EstadoPedido {
    NUEVO("Nuevo"),
    CREADO("Creado"),
    DESPACHADO("Despachado"),
    RECIBIDO("Recibido"),
    CERRADO("Cerrado");

    private String status;

    EstadoPedido(String status) {
        this.status = status;
    }
}