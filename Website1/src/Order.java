

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Order
 */
@WebServlet("/Order")
public class Order extends HttpServlet {
	private static final long serialVersionUID = 1L;
	list li;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		list(request, response);
		PrintWriter out = response.getWriter();
	
		int chic = Integer.parseInt(li.getChic());
		int coffee = Integer.parseInt(li.getCoffee());
		int cs = Integer.parseInt(li.getCs());
		int green = Integer.parseInt(li.getGreen());
		int js = Integer.parseInt(li.getJs());
		int mms = Integer.parseInt(li.getMms());
		int pork = Integer.parseInt(li.getPork());
		int pqs = Integer.parseInt(li.getPqs());
		int red = Integer.parseInt(li.getRed());
		int rice = Integer.parseInt(li.getRice());
		int shark = Integer.parseInt(li.getShark());
		int spare = Integer.parseInt(li.getSpare());
		int sps = Integer.parseInt(li.getSps());
		int yang = Integer.parseInt(li.getYang());
		out.print("<html>");
		out.print("<head>");
		out.print("<title></title>");
		out.print("</head>");
		out.print("<body>");
		
	
	
			if(chic>0){
			out.print(chic + " chicken and mushroom<br>");
		}
			if(coffee>0){
			out.print(coffee + " Cool coffee<br>");
		}
			if(cs>0){
			out.print(cs + " Chick Chinese Siomai<br>");
		}
			if(green>0){
			out.print(green + " Green Iced Tea<br>");
		}
			if(js>0){
			out.print(js + " Japanese Siomai<br>");
		}		
			if(mms>0){
			out.print(mms + " Meaty Mushroom Siomai<br>");
		}
			if(pork>0){
			out.print(pork + " Porky Chops<br>");
		}
			if(pqs>0){
			out.print(pqs + " Pork and Quail Egg Siomai<br>");
		}
			if(red>0){
			out.print(red + " Red Iced Tea<br>");
		} 
		
			if(rice>0){
			out.print(rice + " Plain rice<br>");
		}
		
			if (shark>0){
			out.print(shark + " Sharksfin siomai<br>");
		}
		
			if (spare>0){
			out.print(spare + " Special Spareribs<br>");
		}
		
			if(sps>0){
			out.print(sps + " Special siomai<br>");
		}
		
			if (yang>0){
			out.print(yang + " Yang chow<br>");
		}
		
		
		out.print("Your contact number is " + li.getContact() +"<br>");
		out.print("Thank you");
		out.print("</body>");
		out.print("</html>");
	
	}
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		li = new list();
		li.setChic(request.getParameter("chic"));
		li.setCoffee(request.getParameter("coffee"));
		li.setCs(request.getParameter("cs"));
		li.setGreen(request.getParameter("green"));
		li.setJs(request.getParameter("js"));
		li.setMms(request.getParameter("mms"));
		li.setPork(request.getParameter("pork"));
		li.setPqs(request.getParameter("pqs"));
		li.setRed(request.getParameter("red"));
		li.setRice(request.getParameter("rice"));
		li.setShark(request.getParameter("shark"));
		li.setSpare(request.getParameter("spare"));
		li.setSps(request.getParameter("sps"));
		li.setYang(request.getParameter("yang"));
		li.setContact(request.getParameter("contact"));
	}


}
