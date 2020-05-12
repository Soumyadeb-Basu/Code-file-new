class A():
    def __init__(self,name,salary):
        self.name=name
        self.salary=salary
    def incr(self):
        self.salary+=0.065*self.salary
        return self.salary
      
obj=A('Soumya',21000)
print(obj.name+' '+str(obj.salary))
print('Incremented salary'+str(obj.incr()))