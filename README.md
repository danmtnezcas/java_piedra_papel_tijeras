## Piedra, papel, tijeras en JAVA


### Introducción del juego
El juego "piedra, papel, tijeras" se utiliza con mucha frecuencia para decidir quién de dos personas hará algo, tal y como se hace a veces usando una moneda, o para dirimir algún asunto y tiene las siguientes características:
- Es un juego para dos jugadores.
- El objetivo del juego es sacar el arma que derrote a la del oponente.
- Si ambos jugadores sacan el misma arma, hay empate, entonces, se suele repetir.
- Se puede jugar al mejor de tres o cinco, pero hay que acordarlo antes.


### Armas disponibles
Las siguientes armas son parte del juego: 
- Piedra
- Papel
- Tijeras


### Comportamiento de las armas
Estos son los comportamientos de un arma ante otra:
- Piedra gana a Tijeras: la piedra aplasta las tijeras.
- Papel gana a Piedra: el papel envuelve la piedra.
- Tijeras gana a Piedra: las tijeras cortan el papel.


### Presentación del programa
Este programa esta derrollado en JAVA, utilizando programación estructurada, y el jugador competira contra el ordenador.

El programa se compone de cuatro partes: 
1. Explicar al jugador cómo se juega.
2. Generar la jugada aleatoria del ordenador.
3. Pedir al jugador su jugada mediante una letra (P para piedra, L para papel, T para tijeras o S para salir).
4. Decidir quién ha ganado.