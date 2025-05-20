package ru.hits;

public record GameState(
         int playerHp,
         int playerMaxHp,
         int playerLevel,
         int playerExp,
         int playerX,
         int playerY,
         List<String> inventory
){

}