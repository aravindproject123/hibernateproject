package utils;

import dao.GameDaoUsingHql;
import dao.GameDaoUsingInbuiltFun;
import dto.GameDto;

public class demo
{
    public static void main(String[] args)
    {
        //Create

//        GameDto gameDto=new GameDto();
//        gameDto.setName("Mafia 2");
//        gameDto.setGenre("action");
//        gameDto.setReleaseDate(2008);
//        GameDaoUsingInbuiltFun gameDaoUsingInbuiltFun=new GameDaoUsingInbuiltFun();
//        gameDaoUsingInbuiltFun.createGameData(gameDto);

        ////Update

//        GameDaoUsingInbuiltFun gameDaoUsingInbuiltFun=new GameDaoUsingInbuiltFun();
//        System.out.println(gameDaoUsingInbuiltFun.getGameDatabyId(1));
//        gameDaoUsingInbuiltFun.updateYearGameDatabyId(1,2013);
//        System.out.println(gameDaoUsingInbuiltFun.getGameDatabyId(1));

        //Delete
//        GameDaoUsingInbuiltFun gameDaoUsingInbuiltFun=new GameDaoUsingInbuiltFun();
//        gameDaoUsingInbuiltFun.deleteGameDatabyId(1);

        //HQL

        //Get all the data
//        GameDaoUsingHql gameDaoUsingHql=new GameDaoUsingHql();
//        System.out.println(gameDaoUsingHql.getAllGameData());

        //get data by id
//        GameDaoUsingHql gameDaoUsingHql=new GameDaoUsingHql();
//        System.out.println(gameDaoUsingHql.getGameDatabyId(4));

        //update
//        GameDaoUsingHql gameDaoUsingHql=new GameDaoUsingHql();
//        gameDaoUsingHql.updateGenreGameDatabyId(3,"action/stealth");

        //delete
//        GameDaoUsingHql gameDaoUsingHql=new GameDaoUsingHql();
//        gameDaoUsingHql.deleteGameDatabyId(4);

        //cache testing
        GameDaoUsingHql gameDaoUsingHql=new GameDaoUsingHql();
        System.out.println( gameDaoUsingHql.getGameDatabyId(2));
        System.out.println(gameDaoUsingHql.getGameDatabyId(3));


    }
}
