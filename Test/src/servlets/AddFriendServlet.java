package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import services.FriendsService;

public class AddFriendServlet extends HttpServlet{

	public AddFriendServlet(){
		
	}
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("user");
		String friend=request.getParameter("friend");
		JSONObject res=FriendsService.addFriend(user,friend);
		response.setContentType("text/plain");
		response.getWriter (). println(res.toString ());

	}
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
