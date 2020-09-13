package dao;

import org.hibernate.Transaction;

import org.hibernate.Session;

import dto.GameDto;

public class GameDaoUsingInbuiltFun 
{
	
	public void createGameData(GameDto gameDto) 
	{
		Session session=GetSessionObject.getSessionObject().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(gameDto);
		transaction.commit();
		System.out.println("The data is inserted!!!!");
	}
	public GameDto  getGameDatabyId(int id)
	{
		Session session=GetSessionObject.getSessionObject().openSession();
		return session.get(GameDto.class,id);
	}
	public void updateNameGameDatabyId(int id,String name)
	{
		Session session=GetSessionObject.getSessionObject().openSession();
		Transaction transaction= session.beginTransaction();
		GameDto gameDto=getGameDatabyId(id);
		if(gameDto==null)
		{
			System.out.println("Sorry not found!!!!!!");
			return;
		}
		else
		{
			gameDto.setName(name);
			session.update(gameDto);
			transaction.commit();
			System.out.println("Updated name successfully!!!!!");

		}

	}
	public void updateGenreGameDatabyId(int id,String genre)
	{
		Session session=GetSessionObject.getSessionObject().openSession();
		Transaction transaction= session.beginTransaction();
		GameDto gameDto=getGameDatabyId(id);
		if(gameDto==null)
		{
			System.out.println("Sorry not found!!!!!!");
			return;
		}
		else
		{
			gameDto.setGenre(genre);
			session.update(gameDto);
			transaction.commit();
			System.out.println("Updated genre successfully!!!!!");

		}

	}
	public void updateYearGameDatabyId(int id,int year)
	{
		Session session=GetSessionObject.getSessionObject().openSession();
		Transaction transaction= session.beginTransaction();
		GameDto gameDto=getGameDatabyId(id);
		if(gameDto==null)
		{
			System.out.println("Sorry not found!!!!!!");
			return;
		}
		else
		{
			gameDto.setReleaseDate(year);
			session.update(gameDto);
			transaction.commit();
			System.out.println("Updated year successfully!!!!!");

		}

	}
	public void deleteGameDatabyId(int id)
	{
		Session session=GetSessionObject.getSessionObject().openSession();
		Transaction transaction= session.beginTransaction();
		GameDto gameDto=getGameDatabyId(id);
		if(gameDto==null)
		{
			System.out.println("Sorry not found!!!!!!");
			return;
		}
		else
		{
			session.delete(gameDto);
			transaction.commit();
			System.out.println("Deleted the data with id= "+id);
		}
	}

}
