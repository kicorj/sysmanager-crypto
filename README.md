# Sysmanager-crypto

Este Projeto foi desenvolvido para atender ao desafio da Sys Manager.


## Testes unitários

```sh
mvn test
```

## Instalação (Build do pacote)

```sh
mvn clean package
```

## Execução - Exemplos de chamadas e respostas

Chamada:

```sh
java -jar target/sysmanager-crypto.jar --encrypt=ABCDEFGH
```
Resultado esperado na tela:

```sh
DEFGHIJK
```

Chamada:

```sh
java -jar target/sysmanager-crypto.jar --decrypt=ABCDEFGH
```
Resultado esperado na tela:

```sh
XYZABCDE
```

Chamada:

```sh
java -jar target/sysmanager-crypto.jar --encrypt=A1B2C3D4E5F6G7H
```
Resultado esperado na tela:

```sh
D1E2F3G4H5I6J7K
```

## Autor

* **Francisco Cardoso** - [https://github.com/kicorj](https://github.com/kicorj)
