package Performance.PerformanceKeeperFront.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views/manager")
public class ManagerViewController {

    @GetMapping("/login")
    public String managerLoginPage() {
        return "manager/login-page";
    }

    @GetMapping("/main")
    public String managerMainPage() {
        return "manager/index";
    }

    @GetMapping("/course-create-page")
    public String courseCreatePage() {
        return "manager/course-create-page";
    }

    @GetMapping("/course/{courseId}")
    public String managerCoursePage() {
        return "manager/course-page";
    }

    @GetMapping("/course/{courseId}/task-create-page")
    public String taskCreatePage() {
        return "manager/task-create-page";
    }

    @GetMapping("/course/{courseId}/assignedTask/{assignedTaskId}")
    public String assignedTaskPage() {
        return "manager/task-page";
    }
}
