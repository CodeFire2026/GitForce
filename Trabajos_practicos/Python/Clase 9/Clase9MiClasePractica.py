class MiClasePractica:
    variable_clase = "Es una variable clase"

    def __init__(self, variable_instancia):
        self.variable_instancia = variable_instancia

print(MiClasePractica.variable_clase)
miClase1 = MiClasePractica("Es una variable instancia")
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClasePractica("Esta es otra prueba de variable instancia")
print(miClase2.variable_instancia)
print(miClase2.variable_clase)