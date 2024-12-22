package com.raaveinm.server;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FeedbackController {
    private final List<Feedback> feedbackList = new ArrayList<>();

    @GetMapping("/feedback")
    public String feedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback.html";
    }

    @PostMapping("/feedback")
    public String submitFeedback(@ModelAttribute Feedback feedback) {
        feedbackList.add(feedback);
        return "redirect:/reviews";
    }

    @GetMapping("/reviews")
    public String getReviews(Model model) {
        model.addAttribute("feedbacks", feedbackList);
        return "reviews.html";
    }
}