package com.example.dao;

import com.example.model.Game;

import java.math.BigDecimal;
import java.util.List;

public interface GameDao {
 //Defining the standard CRUD operations to be performed on Game table
    Game addGame(Game game);

    Game getGame(int Id);

    List<Game> getAllGames();

    void updateGame(Game game);

    void deleteGame(int id);

    //Defining the additional operations to be performed on Game table

    Game getGameByEsrb(String esrb);

    Game getGameByStudio(String studio);

    Game getGameByTitle(String title);


}
