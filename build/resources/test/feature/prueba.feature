#Autor: Camilo Sanchez

  #language: es

#@HistoriaDeUsuario
Característica: Verificar el ingreso correcto al app XTTT
  yo como usuario quiero ingresar  a la XTTT para verificar que tengo acceso a ella

#  @CasoLogueo
  Antecedentes: Siempre se ejecutara primero esta linea antes que cualquier caso de prueba
    Dado que Camilo ingresa a la app XTTT

#    @Test1
  #Esquema del escenario:
  Escenario: Verificar ingreso correcto
    Cuando Digita sus credenciales e ingresa a la APP
     # | usuario   | contrasenna   |
     # | <usuario> | <contrasenna> |
    Entonces Verifica que pudo ingresar correctamente
    #Ejemplos:
     # | usuario | contrasenna     |
     # | @prueba | **contrasenna** |