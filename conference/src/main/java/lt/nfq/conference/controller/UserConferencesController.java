package lt.nfq.conference.controller;

import lt.nfq.conference.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserConferencesController {
    @Autowired
    private ConferenceService conferenceService;
    @RequestMapping(value = "/lists", method = RequestMethod.GET)
    public String myConferences(ModelMap model) {

        return "lists";
    }

}
