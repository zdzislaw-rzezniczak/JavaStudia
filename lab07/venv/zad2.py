from typing import Any
import copy

class Dom:

    def __init__(self) -> None:
        self.rodzajDomu = []
    def add(self, part: Any) -> None:
        self.rodzajDomu.append(part)
    def list_parts(self) -> None:
        print(f"Rodzaj domu: {', '.join(self.rodzajDomu)}", end="")

class Builder():

    def __init__(self) -> None:
        self.reset()
    def reset(self) -> None:
        self._product = Dom()
    @property
    def product(self) -> Dom:
        product = self._product
        self.reset()
        return product
    def jednorodzinny(self) -> None:
        self._product.add("Jednorodzinny")
    def wielorodzinny(self) -> None:
        self._product.add("Wielorodzinny")
    def drewniany(self) -> None:
        self._product.add("Drewniany")
    def ceglany(self) -> None:
        self._product.add("Ceglany")

class Director:
    def __init__(self) -> None:
        self._builder = None
    @property
    def builder(self) -> Builder:
        return self._builder
    @builder.setter
    def builder(self, builder: Builder) -> None:
        self._builder = builder
    def jednorodzinny_drewniany(self) -> None:
        self.builder.jednorodzinny()
        self.builder.drewniany()
    def jednorodzinny_murowany(self) -> None:
        self.builder.jednorodzinny()
        self.builder.ceglany()
    def wielorodzinny_drewniany(self) -> None:
        self.builder.wielorodzinny()
        self.builder.drewniany()
    def wielorodzinny_murowany(self) -> None:
        self.builder.wielorodzinny()
        self.builder.ceglany()

if __name__ == "__main__":
        director = Director()
        builder = Builder()
        director.builder = builder

        print("Przykład domu 1: ")
        director.jednorodzinny_murowany()
        builder.product.list_parts()

        print("Przykład domu 2: ")
        director.wielorodzinny_drewniany()
        builder.product.list_parts()