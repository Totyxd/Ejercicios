def sumar(a, b, c):
	print(a+b+c)

sumar(1,2,3)


class Coche:

	puertas=0

	def icrementaPuertas(self):
		self.puertas=self.puertas+1

		return self.puertas

miCoche=Coche()

miCoche.icrementaPuertas()
miCoche.icrementaPuertas()
miCoche.icrementaPuertas()
miCoche.icrementaPuertas()

print(miCoche.puertas)