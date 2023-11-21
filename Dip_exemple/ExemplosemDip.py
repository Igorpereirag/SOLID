class Animal:
    def emitirsom(self):
        print("emitindo som")

class Dog:
    def latir(self):
        #instanciando a classe diretamente na outra
        animal=Animal()
        return animal.emitirsom()

dog = Dog()
dog.latir()


