package a;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/I")
public class I extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public I() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int times = Integer.parseInt(request.getParameter("times"));
		 int xCor = Integer.parseInt(request.getParameter("xCor"));
		 int yCor = Integer.parseInt(request.getParameter("yCor"));
			
			PrintWriter pw = response.getWriter();
	    	File f = new File("text.txt");
	    	FileWriter fw = new FileWriter(f,true);
			PrintWriter w = new PrintWriter(fw);
			w.write("INTELLIGENT METHOD");
    	int p =0;
    	while(p<times) {
    		knight k = new knight(xCor,yCor);
    		int[][][] c = new int[8][8][2];
    		chessBoard cb = new chessBoard(k,c);
    		cb.IntelligentMethod();
    		for(int i=0 ; i<8;i++){
                for(int j = 0 ;j<8;j++){
                    if(c[i][j][0]>9) {
                    	pw.print("  " + c[i][j][0]);
                    }
                    else{
                    	pw.print("  " + c[i][j][0]+" ");
                    }
                }
                
                pw.println("");
                pw.println("");
            }
    		p++;
            pw.println("");
            pw.println("");
            w.write("Trial "+p+" Knight Got till "+cb.getLastNum()+" squares\n");
    	}
    	w.close();
	}


}
