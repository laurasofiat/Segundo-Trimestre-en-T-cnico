/*El código no ejecuta, solo es prueba de mi intento al realizar el código en lenguaje Java */
class Persona {
    protected String edad;  /*protegido:Acceso dentro de la clase y sus subclases*/
    protected String nombre; 
    protected String apellido;

    public Persona(String edad, String nombre, String apellido) { /*Public:Acceso al programa */
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String info() {
        return edad + "," + nombre + "," + apellido; /*Return devuelve un valor y termina la ejecución de un método*/
    }
}

class Empleado extends Persona {  /*Extends define que una clase es heredada de otra*/ 
    private String horario; /*Premite acceso solo dentro de la clase*/
    private String cargo;
    private String salario;

    public Empleado(String edad, String nombre, String apellido, String horario, String cargo, String salario) {
        super(edad, nombre, apellido);
        this.horario = horario;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String realizarVenta() {
        return "El empleado " + nombre + " ha realizado una venta";
    }

    public String atenderClientes() {
        return "El empleado " + nombre + " está atendiendo clientes";
    }

    public String info() {
        return edad + "," + nombre + "," + apellido + "," + horario + "," + cargo + "," + salario;
    }
}

class Administrador extends Persona {
    public Administrador(String edad, String nombre, String apellido) {
        super(edad, nombre, apellido); /*Super:Hace referencia a el constructor*/
    }

    public String organizarRoles() {
        return "El administrador " + nombre + " ha organizado los roles";
    }

    public String atenderClientes() {
        return "El empleado " + nombre + " está atendiendo clientes";
    }

    public String info() {
        return edad + "," + nombre + "," + apellido;
    }
}

class Cliente extends Persona {
    private String direccion;
    private String telefono;
    private String cedula;
    private String codigoCliente;

    public Cliente(String edad, String nombre, String apellido, String direccion, String telefono, String cedula, String codigoCliente) {
        super(edad, nombre, apellido);
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
        this.codigoCliente = codigoCliente;
    }

    public String realizarCompra() {
        return "El cliente " + nombre + " ha realizado una compra";
    }

    public String info() {
        return edad + "," + nombre + "," + apellido + "," + direccion + "," + telefono + "," + cedula + "," + codigoCliente;
    }
}

class Venta {
    private String horaVenta;
    private String diaVenta;
    private String mesVenta;
    private String añoVenta;
    private String cantidadProductosVendidos;

    public Venta(String horaVenta, String diaVenta, String mesVenta, String añoVenta, String cantidadProductosVendidos) {
        this.horaVenta = horaVenta;
        this.diaVenta = diaVenta;
        this.mesVenta = mesVenta;
        this.añoVenta = añoVenta;
        this.cantidadProductosVendidos = cantidadProductosVendidos;
    }

    public String calcularTotal() {
        return "La venta ha calculado el total";
    }

    public String generarFactura() {
        return "La venta ha generado la factura";
    }

    public String info() {
        return horaVenta + "," + diaVenta + "," + mesVenta + "," + añoVenta + "," + cantidadProductosVendidos;
    }
}

class Inventario {
    private ArrayList<String> listaPrendaRopa; /*arraylist se utiliza para almacenar información en una lista*/
    private String stock;

    public Inventario(ArrayList<String> listaPrendaRopa, String stock) {
        this.listaPrendaRopa = listaPrendaRopa;
        this.stock = stock;
    }

    public String generarReporte() {
        return "El inventario ha generado un reporte";
    }

    public String actualizarStock() {
        return "El inventario ha actualizado el stock";
    }

    public String info() {
        return listaPrendaRopa.toString() + "," + stock;
    }
}

public class Código_Ejercicio_Python {
    public static void main(String[] args) { /*static:El método pertenece a la clase,no a los objetos, void no retorna ningun valor, main para ejecutar código*/
        Empleado empleado1 = new Empleado("25", "Ana", "García", "Mañana", "Vendedora", "1500000");
        System.out.println(empleado1.info());
        System.out.println(empleado1.realizarVenta());
        System.out.println(empleado1.atenderClientes());

        Administrador admin1 = new Administrador("40", "Luis", "Martínez");
        System.out.println(admin1.info()); /* system.out.println se utiliza para mostrar lso resultados y la información de objetos*/
        System.out.println(admin1.organizarRoles());
        System.out.println(admin1.atenderClientes());

        Cliente cliente1 = new Cliente("20", "Alejandro", "Zuñiga", "Cra 5 # 10-20", "3001234567", "123456798", "C001");
        System.out.println(cliente1.realizarCompra());
        System.out.println(cliente1.info());

        Venta venta1 = new Venta("3:00", "20", "Enero", "2025", "5");
        System.out.println(venta1.calcularTotal());
        System.out.println(venta1.generarFactura());
        System.out.println(venta1.info());

        ArrayList<String> prendas = new ArrayList<>();
        prendas.add("Camisas");
        prendas.add("Pantalones");
        prendas.add("Chaquetas");
        Inventario inventario1 = new Inventario(prendas, "100");
        System.out.println(inventario1.generarReporte());
        System.out.println(inventario1.actualizarStock());
        System.out.println(inventario1.info());
    }
}