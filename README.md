# MyCalculator

This repo has been created as test in order to understand how work as team in a project using Git and GitHub

## Funcionalidades

Somar, Multiplicar, Subtrair

### Melhorias no Projecto

_Adicão do método_ **fatorial** como método privado

### Lista de Pendentes

* Ficheiro de log
* Tratamento de excepção

### Lista API por consumit

1. MathAPI
2. IntegralAPI

### Imagem Local

![Math API](image/t1-overview.png)

## Links interessantes

[Google](https://www.google.com/)

### Código do método somar

```java
public static double soma(double valor1, double valor2){

        if(Objects.isNull(valor1) || Objects.isNull(valor2)){

            throw new IllegalArgumentException("O valor inválido, verifica os parâmetros...");
        }

        return (valor1 + valor2);
    }
```

### Lista de Tarefas a fazer

- [X] Função dividri
- [ ] Tratamento de exceção