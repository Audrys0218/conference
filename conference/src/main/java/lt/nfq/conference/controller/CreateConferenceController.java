package lt.nfq.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreateConferenceController {

    @RequestMapping(value = "/createConference", method = RequestMethod.GET)
    public String createConference() {
        return "createConference";
    }

    @RequestMapping(value = "/myConferences", method = RequestMethod.GET)
    public String myConferences() {
        return "myConferences";
    }

  //  @RequestMapping(value = "/login", method = RequestMethod.POST)
   // public String login() {
   //     return "redirect:/conference/list";
  //  }
}
