#Autor: Camilo Sanchez

  #language: es


Característica: Registrarse con un usuario ya  existente al app
  yo como usuario quiero Registrar un usuario existente a la app para verificar que no registre usuario duplicado

#  @CasoLogueo
  Antecedentes: Siempre se ejecutara primero esta linea antes que cualquier caso de prueba
    Dado que Camilo ingresa a la app demoblaze

#    @Test1
  #Esquema del escenario:
  Escenario: Registrar con un usuario ya  existente
    Cuando Digita sus datos de registro
    Entonces Verifica que no pudo registrar correctamente
