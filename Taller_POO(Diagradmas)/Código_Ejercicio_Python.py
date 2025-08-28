class Persona:
    def __init__(self,edad,nombre,apellido): #__init__ contructor
        self.edad=edad
        self.nombre=nombre
        self.apellido=apellido
    def info(self):
        return f"{self.edad},{self.nombre},{self.apellido}" #return para mostrar la información de la clase anterior

class Empleado(Persona):
    def __init__(self,edad,nombre,apellido,horario,cargo,salario):
        super().__init__(edad, nombre, apellido) #Llama al constructor de la clase Persona
        self.horario=horario
        self.cargo=cargo
        self.salario=salario

    def Realizar_venta(self):
        return f"El empleado {self.nombre} ha realizado una venta"
    def Atender_clientes(self):
        return f"El empleado {self.nombre} está atendiento clientes"
    def Info(self):
        return f"{self.edad},{self.nombre},{self.apellido},{self.horario},{self.cargo},{self.salario}"

class Administrador(Persona):
    def __init__(self,edad,nombre,apellido):
        super().__init__(edad, nombre, apellido)

    def Organizar_Roles(self):
        return f"El administrador{self.nombre} a organizado los roles"
    def Atender_clientes(self):
        return f"El empleado {self.nombre} está atendiento clientes"
    def Info(self):
        return f"{self.edad},{self.nombre},{self.apellido}"


class Cliente(Persona):
    def __init__(self,edad,nombre,apellido,dirección,teléfono,cedula,codigo_cliente):
        super().__init__(edad, nombre, apellido)
        self.dirección=dirección
        self.teléfono=teléfono
        self.cedula=cedula
        self.codigo_cliente=codigo_cliente

    def Realizar_compra(self):
        return f"El cliente{self.nombre} ha realizado una compra"
    def Info(self):
        return f"{self.edad},{self.nombre},{self.apellido},{self.dirección},{self.teléfono},{self.cedula},{self.codigo_cliente}"

class Venta:
    def __init__(self,Hora_venta,Día_venta,Mes_venta,Año_venta,Cantidad_productos_vendidos):
        self.Hora_venta=Hora_venta
        self.Día_venta=Día_venta
        self.Mes_venta=Mes_venta
        self.Año_venta=Año_venta
        self.Cantidad_productos_vendidos=Cantidad_productos_vendidos

    def Calcular_Total(self):
        return f"La venta ha calculado el total"
    def Generar_Factura(self):
        return f"La venta ha generado la factura"
    def Info(self):
        return f"{self.Hora_venta},{self.Día_venta},{self.Mes_venta},{self.Año_venta},{self.Cantidad_productos_vendidos}"   
class Inventario:
    def __init__(self,Lista_Prenda_Ropa,Stock):
        self.lista_Prenda_Ropa=Lista_Prenda_Ropa
        self.Stock=Stock
    def Generar_Reporte(self):
            return f"El inventario ha generado un reporte"
    def Actualizar_Stock(self):
            return f"El inventario ha actualizado el stock"
    def Info(self):
            return f"{self.lista_Prenda_Ropa},{self.Stock}"


#Ingresa información para probar las clases y sus métodos
if __name__ == "__main__": #Main para evitar una ejecución no deseada al tener las clases en la misma ruta
    empleado1 = Empleado("25", "Ana", "García", "Mañana", "Vendedora", "1500000")
    print(empleado1.Info())
    print(empleado1.Realizar_venta())
    print(empleado1.Atender_clientes())

    admin1 = Administrador("40", "Luis", "Martínez")
    print(admin1.Info())
    print(admin1.Organizar_Roles())
    print(admin1.Atender_clientes())
    
    cliente1 = Cliente("20", "Alejandro", "Zuñiga", "Cra 5 # 10-20", "3001234567", "123456798", "C001")
    print(cliente1.Realizar_compra())
    print(cliente1.Info())
    
    Venta1 = Venta("3:00", "20", "Enero", "2025", "5")
    print(Venta1.Calcular_Total())
    print(Venta1.Generar_Factura())
    print(Venta1.Info())
    
    Inventario1= Inventario(["Camisas, Pantalones, Chaquetas"], "100")
    print(Inventario1.Generar_Reporte())
    print(Inventario1.Actualizar_Stock())
    print(Inventario1.Info())













