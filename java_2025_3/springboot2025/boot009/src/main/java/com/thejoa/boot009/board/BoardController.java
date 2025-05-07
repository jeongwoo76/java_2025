package com.thejoa.boot009.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService service;
	
	@GetMapping("/board/list")
	public String list(Model model){
		model.addAttribute("list", service.findAll());
		return "board/list";
	}
	
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable(required = true) Long id, Model model) {
	    if (id == null) return "redirect:/board/list";
	    try {
	        model.addAttribute("dto", service.find(id));
	        return "board/detail";
	    } catch (Exception e) {
	        return "redirect:/board/list";
	    }
	}
	
	@GetMapping("/board/insert")
	public String insert_get() { return "board/write"; }
	
	@PostMapping("/board/insert")
	public String insert_post(Board board) {
		System.out.println("...."+board);
		service.insert(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/update/{id}")
	public String update_get(@PathVariable Long id, Model model) {
		model.addAttribute("dto", service.update_view(id));
		return "board/edit";
	}
	
	@PostMapping("/board/update")
	public String update_post(Board board, RedirectAttributes rttr){
		String msg ="fail";
		if(service.update(board) > 0) { msg="글 수정완료!"; }
		rttr.addFlashAttribute("msg", msg);
		return "redirect:/board/detail/" + board.getId();
	}
	
	@GetMapping("/board/delete/{id}")
	public String delete_get(@PathVariable Long id, Model model) {
		model.addAttribute("id", id);
		return "board/delete"; }
	
	@PostMapping("/board/delete")
	public String delete_post(Board board, RedirectAttributes rttr) {
		String msg="fail";
		if(service.delete(board) >0) { msg="글삭제성공!"; }
		rttr.addFlashAttribute("msg", msg);
		return "redirect:/board/list";
	}

}
