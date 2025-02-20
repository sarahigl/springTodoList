package com.springtodo.springtodo.viewController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springtodo.springtodo.model.Task1;
import com.springtodo.springtodo.service.TaskService;

@Controller
public class TaskViewController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/test")
    public String testHello(){
        System.out.println("/hello");
        return "test";
    }
    

    @GetMapping("/liste")
    public String getTasksView(Model model) {
        List<Task1> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        //System.out.println(tasks);
        return "tache"; 
    }

}
