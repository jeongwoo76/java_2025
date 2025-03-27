package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
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
		
		if(path.equals("/list.do")) {
			System.out.println("list.do : C:전체리스트        BList        /      V:list.jsp ");
			//  C:전체리스트        BList        /      V:list.jsp 
		}else if(path.equals("/write_view.do")) {
				System.out.println("/write_view.do : 글쓰기폼 ");
				//  C:X										V:write.jsp 
		}else if(path.equals("/write.do")) {
			System.out.println("//write.do : 글쓰기기능 ");
			//   C:글삽입             BWrite(알림창- 성공/실패) /   V: /list.do		
		}else if(path.equals("/detail.do")) {
			System.out.println("/detail.do : 상세보기 ");
			//   C:BDetail(조회수올리기/해당글상세)		 V: /detail.jsp
		}else if(path.equals("/edit_view.do")) {
			System.out.println("/edit_view.do : 글수정폼 ");
			//   C: BEditView(해당글상세)		 V: /edit.jsp
		}else if(path.equals("/edit.do")) {
			System.out.println("/edit.do : 글수정 ");
			//  C:BEdit(해당글수정)		 V: detail.jsp
		}else if(path.equals("/delete.do")) {
			System.out.println("/delete.do : 글삭제 ");
			//  C:BDelete(해당글삭제)	       V: /lsit.do	
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
 */

