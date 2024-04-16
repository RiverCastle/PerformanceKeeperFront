package Performance.PerformanceKeeperFront.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class ViewController {

    @GetMapping("/home")
    public String homepage() {
        return "common/home";
    }
    @GetMapping("/sign-up")
    public String signUpPage() {
        return "common/sign-up-page";
    }

    @GetMapping("/login")
    public String logInPage() {
        return "common/login-page";
    }

    @GetMapping("/main")
    public String mainPage() {
        return "common/index";
    }

    @GetMapping("/course-list-page")
    public String courseListPage() {
        return "common/course-list-page";
    }

    @GetMapping("/course/{courseId}")
    public String coursePage() {
        return "student/course-page";
    }

    @GetMapping("/course/{courseId}/assignedTask/{assignedTaskId}")
    public String assignedTaskPage() {
        return "student/task-page";
    }
}