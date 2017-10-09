# Worms Arena

Deux vers font un duel dans une arène : il ne peut en rester qu’un !

Chaque vers a un nombre de points de vie et un nombre de points de dégâts qu'il inflige. Lors d’un match, les vers s’attaquent à tour de rôle jusqu’à ce que l’un d’eux ne possède plus de point de vie. Lorsqu'un des deux vers perd le combat, l'autre est déclaré vainqueur.

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar FightTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore FightTest
