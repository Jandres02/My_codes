class suma:
    uno = 0
    dos = 0
    res = 0
    
    def __init__ (self, u, d):
        self.uno = u
        self.dos = d

    def pantalla(self):
        print("Numero uno = "+str(self.uno))
        print("Numero dos = "+str(self.dos))
        print("la suma es = "+str(self.res))
    
    def operacion(self):
        self.res = self.uno + self.dos
    
objeto = suma(36, 58)
objeto.operacion()
objeto.pantalla()