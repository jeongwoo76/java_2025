package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.BDelete;
import com.company.service.BDetail;
import com.company.service.BEdit;
import com.company.service.BEditView;
import com.company.service.BList;
import com.company.service.BWrite;
import com.company.service.BoardService;


@WebServlet("*.do")   //#1
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FrontController() { super();    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response); //#2
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response); //#2
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String path = request.getServletPath();
		
		BoardService service = null; //##
		
		//		NaverBook book = new NaverBook();
		//		book.getBooks();
		
		if(path.equals("/list.do")) {
			//System.out.println("list.do : C:전체리스트        BList        /      V:list.jsp ");
			//  C:전체리스트  BList /  V:list.jsp 
			service = new BList(); service.exec(request, response);  //처리
			request.getRequestDispatcher("board/list.jsp").forward(request, response);  //경로
			
		}else if(path.equals("/write_view.do")) {
				//  C:X										V:write.jsp 
			request.getRequestDispatcher("board/write.jsp").forward(request, response);
				
		}else if(path.equals("/write.do")) {
			//   C:글삽입  BWrite(알림창- 성공/실패) / V: /list.do	
			service = new BWrite(); service.exec(request, response);
			//System.out.println("1:" + request.getAttribute("result"));  1:1
			String result = (String) request.getAttribute("result");
			String msg ="관리자에게 문의바랍니다.";
			if(result.equals("1")) {
				msg="글쓰기에 성공했습니다!";
			}
			out.println("<script> alert('"+msg+"'); location.href='list.do'; </script>");
			
		}else if(path.equals("/detail.do")) {
			//   C:BDetail(조회수올리기/해당글상세)	 V: detail.jsp
			service = new BDetail(); service.exec(request, response); 
			request.getRequestDispatcher("board/detail.jsp").forward(request, response);  
			
		}else if(path.equals("/edit_view.do")) {
			//   C: BEditView(해당글상세) V: update.jsp
			service = new BEditView(); service.exec(request, response); 
			request.getRequestDispatcher("board/update.jsp").forward(request, response);
			
		}else if(path.equals("/edit.do")) {
			//  C:BEdit(해당글수정)	 V: /detail.do
			service = new BEdit(); service.exec(request, response); 
			
			String result = (String) request.getAttribute("result");
			String msg ="관리자에게 문의바랍니다.";
			if(result.equals("1")) { msg="글수정에 성공했습니다!"; }
			
			out.println("<script> alert('"+msg+"'); location.href='detail.do?bno="+
									request.getParameter("bno") +"'; </script>");
			
		}else if(path.equals("/delete.do")) {
			//  C:BDelete(해당글삭제)	V: /lsit.do	
			service = new BDelete(); service.exec(request, response); 
			
			String result = (String) request.getAttribute("result");
			String msg ="관리자에게 문의바랍니다.";
			if(result.equals("1")) { msg="글삭제에 성공했습니다!"; }
			
			out.println("<script> alert('"+msg+"'); location.href='list.do'; </script>");
			
		}
		
	}

}

/*
         ㄴ  /list.do           - C:전체리스트        BList        /      V:list.jsp 
		 ㄴ  /write_view.do - C:X                                          V:write.jsp 
		 ㄴ  /write.do        - C:글삽입             BWrite(알림창- 성공/실패) /   V: /list.do
		 ㄴ  /detail.do      - C:해당번호 상세보기  BDetail(조회수올리기/해당글상세)
                                      V:detail.jsp
		 ㄴ  /edit_view.do  - C:해당번호 글수정폼  BEditView(해당글상세)
                                      V:edit.jsp
		 ㄴ  /edit.do       - C:해당번호 글수정기능 BEdit(해당글수정)
                                      V: /detail.do 
		 ㄴ  /delete.do     - C:해당번호 글삭제기능 BDelete(해당글삭제)      V: /list.do
		 
		 
		<<interface>> BoardService   - exec(request, response)   
   ↑             ↑            ↑            ↑            ↑           ↑  
   BList   BWrite        BDetail     BEditView     BEdit       BDelete    <<class>>

>   BList     전체리스트   -  dao.list()
>   BWrite    글삽입       -  dao.insert(dto)  / 알림창- 성공/실패
>   BDetail   상세보기     -  dao.updateHit(dto) , dao.detail(dto)
>   BEditView 글수정폼   -  dao.detail(dto)
>   BEdit     글수정        -  dao.update(dto)  / 알림창- 성공/실패
>   BDelete   해당글삭제-  dao.delete(dto)  / 알림창- 성공/실패
		 
		 
 */

