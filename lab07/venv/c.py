class AttrTest :
    def __setattr__(self, name, value) :
        super().__setattr__(name,value)
    def __getattr__(self, name):
        print( " nie ma" )
a = AttrTest ()
a.nic = 4
a.nic
