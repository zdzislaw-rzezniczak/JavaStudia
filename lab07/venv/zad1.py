from typing import Any

class Logowanie:

    def __init__(self) -> None:
        self.stronacss = []
        self.stronahtml = []
    def addHtml(self, part: Any) -> None:
        self.stronahtml.append(part)
    def addCss(self, part: Any) -> None:
        self.stronacss.append(part)
    def list_parts(self) -> None:
        print(f"Kod CSS: {', '.join(self.stronacss)}", end="")
        print(f"Kod HTML: {', '.join(self.stronahtml)}", end="")
    def zapis(self) -> None:
        try:
          with open("index.html", 'w') as h:
              h.writelines(self.stronahtml)
          print("html done")
          with open("style.css", 'w') as c:
              c.writelines(self.stronacss)
          print("css done")
        except IOError:
          print("nope")
        finally:
          print("end")


class BuilderLogowanie():

    def __init__(self) -> None:
        self.reset()
    def reset(self) -> None:
        self._product = Logowanie()
    @property
    def product(self) -> Logowanie():
        product = self._product
        self.reset()
        return product
    def htmlBuild(self) -> None:
        self._product.addHtml("""<!DOCTYPE html>
<html lang="pl-PL">
<head>
<meta charset="uth-8">
<title>Stron testowa - python lab</title>
<link rel="stylesheet" href="style.css" type="text/css" />
        
</head>
        
<body>
<div id="panel">
<form>
<label for="username">Nazwa użytkownika:</label>
<input type="text" id="username" name="username">
<label for="password">Hasło:</label>
<p><a href="#">Zapomniałeś hasła?</a></p>
<input type="password" id="password" name="password">
<div id="lower">
<input type="checkbox"><label class="check" for="checkbox">Zapamiętaj mnie!</label>
<input type="submit" value="Login">
</div>
</form>
</div>
</body>
        
</html>""")
    def cssBuild(self) -> None:
        self._product.addCss("""#panel {
width: 400px; 
margin: 0 auto; 
padding: 15px 0 0;
background: #fff;
border: 1px solid silver;
font: 16px calibri;
letter-spacing: -1px;
-webkit-box-shadow: 0 0 2px silver; 
-moz-box-shadow: 0 0 2px silver; 
box-shadow: 0 0 2px silver;
}
form {
margin: 0;
}
label {
display: block;
width: 260px;
padding: 10px 20px;
color: #696969;
font-size: 16px;
text-shadow: 0 0 1px silver;
}   
#username, #password {
display: block;
width: 360px; 
margin: 0 auto;
padding: 10px 5px;
border: 1px solid silver;
outline: 5px solid #ebebeb;
font-size: 22px;
}
#username:focus, #password:focus {
outline: 5px solid #e5f2f8;
}
#lower {
background: #ecf2f5;
width: 360px;
padding: 5px 20px;
margin-top: 20px;
}""")


class Director:
    def __init__(self) -> None:
        self._builder = None
    @property
    def builder(self) -> BuilderLogowanie:
        return self._builder
    @builder.setter
    def builder(self, builder: BuilderLogowanie) -> None:
        self._builder = builder
    def logowanieCss (self) -> None:
        self.builder.cssBuild()
    def logowanieHtml(self) -> None:
        self.builder.htmlBuild()

if __name__ == "__main__":
        director = Director()
        builder = BuilderLogowanie()
        director.builder = builder

        print("Budowa strony -> logowanie: ")
        director.logowanieHtml()
        director.logowanieCss()
        builder.product.zapis()