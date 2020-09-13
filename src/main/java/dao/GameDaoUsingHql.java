package dao;

import dto.GameDto;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class GameDaoUsingHql
{
    public void createGameData(GameDto gameDto)//hql doesnot support insert command
    {
        GameDaoUsingInbuiltFun gameDaoUsingInbuiltFun=new GameDaoUsingInbuiltFun();
        gameDaoUsingInbuiltFun.createGameData(gameDto);
    }
    public List<GameDto> getAllGameData()
    {
        Session session=GetSessionObject.getSessionObject().openSession();
        String hql="from GameDto";
        Query query= session.createQuery(hql);
        query.setCacheable(true);
        List<GameDto> list=query.list();
        return list;
    }
    public GameDto  getGameDatabyId(int id)
    {
        Session session=GetSessionObject.getSessionObject().openSession();
        String hql="from GameDto where id=:id";
        Query query=session.createQuery(hql);
        query.setCacheable(true);
        query.setParameter("id",id);
        GameDto gameDto=(GameDto) query.uniqueResult();
        return gameDto;

    }
    public void updateNameGameDatabyId(int id,String name)
    {
        Session session = GetSessionObject.getSessionObject().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="update GameDto set name=:name where id=:id";
        Query query=session.createQuery(hql);
        query.setParameter("id",id);
        query.setParameter("name",name);
        int result=  query.executeUpdate();
        transaction.commit();
        if(result==1) System.out.println("Updated successfully!!!!");
        else System.out.println(" unsuccessfull!!!!");

    }
    public void updateGenreGameDatabyId(int id,String genre)
    {
        Session session = GetSessionObject.getSessionObject().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="update GameDto set genre=:genre where id=:id";
        Query query=session.createQuery(hql);
        query.setParameter("id",id);
        query.setParameter("genre",genre);
        int result=  query.executeUpdate();
        transaction.commit();
        if(result==1) System.out.println("Updated successfully!!!!");
        else System.out.println(" unsuccessfull!!!!");

    }
    public void updateYearGameDatabyId(int id,int releaseDate)
    {
        Session session = GetSessionObject.getSessionObject().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="update GameDto set releaseDate=:releaseDate where id=:id";
        Query query=session.createQuery(hql);
        query.setParameter("id",id);
        query.setParameter("releaseDate",releaseDate);
        int result=  query.executeUpdate();
        transaction.commit();
        if(result==1) System.out.println("Updated successfully!!!!");
        else System.out.println(" unsuccessfull!!!!");

    }
    public void deleteGameDatabyId(int id)
    {
        Session session = GetSessionObject.getSessionObject().openSession();
        Transaction transaction = session.beginTransaction();
        String hql="delete GameDto where id=:id";
        Query query=session.createQuery(hql);
        query.setParameter("id",id);
        int result=query.executeUpdate();
        transaction.commit();
        if(result==1) System.out.println("Deleted successfully!!!!");
        else System.out.println(" unsuccessfull!!!!");
    }



}
