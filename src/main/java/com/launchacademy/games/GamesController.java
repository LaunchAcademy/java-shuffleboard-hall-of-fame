package com.launchacademy.games;

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
public class GamesController extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // check for the proper path
    if(request.getServletPath().equals("/games/new")) {
      // render the form at "/games/new"
      RequestDispatcher dispatcher = request.getRequestDispatcher("/views/games/form.jsp");
      dispatcher.forward(request, response);
    }
    else {
      response.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // check for the proper path
    if(request.getServletPath().equals("/games")) {
      // make an empty com.launchacademy.games.Game
      Game newGame = new Game();

      // fill it with the user's input
      try {
        BeanUtils.populate(newGame, request.getParameterMap());
      }
      catch(IllegalAccessException ex){
        System.out.println("ERROR");
        System.out.println("BeanUtils could not find setter: ");
        System.out.println(ex);
      }
      catch(InvocationTargetException ex) {
        System.out.println("ERROR");
        System.out.println("BeanUtils had an error with the setter: ");
        System.out.println(ex);
      }

      // try to save it to the database
      EntityManagerFactory emf = getEmf();
      EntityManager em = emf.createEntityManager();

      GameService service = new GameService(em);
      service.save(newGame);

      em.close();

      // redirect somewhere once it's done
      response.sendRedirect("/games/new");
    }
    else {
      response.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }

  private EntityManagerFactory getEmf() {
    return (EntityManagerFactory)this.getServletContext().getAttribute("emf");
  }
}
