import java.util.ArrayList;

public class Pedido {
	private EstadoPedido estado;
	private Cuenta cuenta;
	private ArrayList<Pago> pagos = new ArrayList<Pago>();
	private ArrayList<Familia_de_Productos> producto = new ArrayList<Familia_de_Productos>();
	public EstadoPedido unnamed_EstadoPedido_;

	public EstadoPedido getEstado() {
		return this.estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}
}