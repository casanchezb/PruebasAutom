#Autor: Camilo Sanchez

  #language: es

Característica: Agregar productos al carro de compras
  yo como usuario quiero agregar productos a la pagina demoblaze  para verificar que se registren correctamente

#  @CasoLogueo
  Antecedentes: Abrir URL para realizar casos de prueba
    Dado que Camilo ingresa a la app demoblaze

#    @TestAgregar
  #Esquema del escenario:

  Escenario: Agregar productos correctamente
    Cuando Selecciona un producto
    Entonces Verifica que ingreso correctamente los productos
