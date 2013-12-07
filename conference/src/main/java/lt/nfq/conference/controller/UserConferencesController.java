package lt.nfq.conference.controller;

import lt.nfq.conference.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;

@Controller
public class UserConferencesController {
    //Veliau sita reikes paimti is duomenu bazes naudojant sprin secure frameworka
    private final static Integer USER_ID = 1;
    @Autowired
    private ConferenceService conferenceService;


    @RequestMapping(value = "/lists", method = RequestMethod.GET)
    public String myConferences(ModelMap model) {
        model.addAttribute("createdConf", conferenceService.getConferencesByCreatorId(1));
        model.addAttribute("dateFormat", getDateFormat());
        //model.addAttribute("participatedConf", conferenceService.et)
        return "lists";
    }

    private SimpleDateFormat getDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd");
    }

}
