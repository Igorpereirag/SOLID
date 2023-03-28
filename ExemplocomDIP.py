class Animal:
    def emitirsom(self):
        print("emitindo som")


class Dog:
    # injetando a classe animal
    def __init__(self, animal: Animal):
        self.animal = animal

    def latir(self):
        # acessando o metodo por injeção
        return self.animal.emitirsom()
    
animal=Animal()    
dog=Dog(animal)
dog.latir()


 