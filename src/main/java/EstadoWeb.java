public enum EstadoWeb {
    NUEVO("Nuevo"),
    ACTIVO("Activo"),
    BLOQUEADO_TEMPORALMENTE("Bloqueado temporalmente"),
    PROHIBIDO("Prohibido");

    private String status;

    EstadoWeb(String status) {
        this.status = status;
    }
}