package com.launchacademy.games.controllers;

import com.launchacademy.games.models.Game;
import com.launchacademy.games.services.GameService;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

@WebServlet(urlPatterns = {"/games/new", "/games"})
public class GameController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (req.getServletPath().equals("/games/new")) {
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/games/new.jsp");
      dispatcher.forward(req, resp);
    } else if (req.getServletPath().equals("/games")) {
      EntityManagerFactory emf = getEmf();
      EntityManager em = emf.createEntityManager();
      GameService gameService = new GameService(em);
      List<Game> allGames = gameService.findAll();
      em.close();
      req.setAttribute("games", allGames);
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/games/index.jsp");
      dispatcher.forward(req, resp);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (req.getServletPath().equals("/games")) {
      EntityManagerFactory emf = getEmf();
      EntityManager em = emf.createEntityManager();
      GameService gameService = new GameService(em);
      boolean isSaved = gameService.save(req.getParameterMap());
      em.close();

      if (isSaved) {
        resp.sendRedirect("/games");
      } else {
        resp.sendRedirect("/games/new");
      }

    }
  }

  private EntityManagerFactory getEmf() {
    return (EntityManagerFactory) this.getServletContext().getAttribute("emf");
  }
}
