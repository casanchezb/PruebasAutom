#Autor: Camilo Sanchez

  #language: es

Característica: Eliminar productos del carro de compras
  yo como usuario quiero eliminar productos del carrito  para verificar que se eliminen correctamente

#  @CasoLogueo
  Antecedentes: Abrir URL para realizar casos de prueba
    Dado que Camilo ingresa a la app demoblaze

#    @TestAgregar
  #Esquema del escenario:

  Escenario: Eliminar productos correctamente
    Cuando Selecciono un producto del carrito
    Entonces Verifica que elimino correctamente el producto