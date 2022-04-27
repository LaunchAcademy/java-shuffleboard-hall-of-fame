package com.launchacademy.games.services;

import com.launchacademy.games.models.Game;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.commons.beanutils.BeanUtils;

public class GameService {

  private final EntityManager em;

  public GameService(EntityManager em) {
    this.em = em;
  }

  public boolean save(Map<String, String[]> parameterMap) {
    Game newGame = new Game();
    try {
      BeanUtils.populate(newGame, parameterMap);
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }

    try {
      em.getTransaction().begin();
      em.persist(newGame);
      em.getTransaction().commit();
      System.out.println("Persisted successfully!");
      return true;
    } catch (Exception e) {
      em.getTransaction().rollback();
      e.printStackTrace();
      System.out.println("Persist failed");
      return false;
    }
  }

  public List<Game> findAll() {
    TypedQuery<Game> query = em.createQuery("SELECT g FROM Game g", Game.class);
    return query.getResultList();
  }
}
