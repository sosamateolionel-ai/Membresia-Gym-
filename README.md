# Membresía de Socio

## Descripción

Programa desarrollado en Java que simula la gestión de membresías de un gimnasio. Permite registrar socios, controlar el pago de cuotas, verificar si pueden ingresar y cambiar el plan contratado.

## Funcionamiento

El programa utiliza una clase `membresiaSocio` con los siguientes atributos:

* `nombreSocio`: almacena el nombre del socio.
* `numeroSocio`: identifica al socio.
* `plan`: indica el plan contratado.
* `cuota`: representa el valor de la cuota.
* `pago`: indica si la cuota está pagada.
* `habilitado`: indica si el socio puede ingresar al gimnasio.

La clase utiliza un **constructor** para establecer los datos iniciales del socio. El atributo `habilitado` comienza con el mismo valor que `pago`.

Cuenta con cuatro métodos principales:

* `registrarPago()`: registra el pago de la cuota y cambia el estado de `pago` a `true`.
* `verificarPago()`: comprueba si la cuota está pagada y determina si el socio está habilitado para ingresar.
* `cambiarPlan()`: permite cambiar el plan contratado.
* `mostrarEstado()`: muestra por consola todos los datos y el estado actual del socio.

## Lógica de habilitación

El método `verificarPago()` utiliza una estructura condicional para determinar si el socio puede ingresar:

```java id="c8s1fk"
if (pago) {
    habilitado = true;
} else {
    habilitado = false;
}
```

Si la cuota está pagada, el socio queda habilitado. Si no está pagada, queda deshabilitado.

En el método `main` se crean tres socios con diferentes planes y estados de pago. Se simulan pagos, cambios de plan y verificaciones para comprobar el estado de cada membresía.

## Captura de ejecución

<img width="336" height="620" alt="image" src="https://github.com/user-attachments/assets/991471fc-3abf-4bf0-9f4c-4a7f37875cb4" />

