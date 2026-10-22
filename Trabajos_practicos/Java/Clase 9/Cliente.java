import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() { return idCliente; }
    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }
    public boolean isVip() { return vip; }
    public void setVip(boolean vip) { this.vip = vip; }

    @Override
    public String toString() {
        return "Cliente [id=" + idCliente + ", fecha=" + fechaRegistro + ", vip=" + vip + ", " + super.toString() + "]";
    }


    public static void main(String[] args) {
        Cliente cliente = new Cliente("Heber", 'M', 25, "San Rafael", new Date(), true);
        
        System.out.println("Cliente creado correctamente");
        System.out.println("Fecha de registro: " + cliente.getFechaRegistro());
        System.out.println("VIP: " + cliente.isVip());
        System.out.println("Datos completos: " + cliente.toString());
    }
}