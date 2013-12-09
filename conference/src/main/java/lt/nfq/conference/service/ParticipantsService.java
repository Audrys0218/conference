package lt.nfq.conference.service;

import lt.nfq.conference.domain.Participants;
import lt.nfq.conference.service.dao.ParticipantsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Audrius
 * Date: 12/9/13
 * Time: 9:33 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ParticipantsService {
    @Autowired
    private ParticipantsMapper participantsMapper;
    public List<Participants> getParticipants(int participant_id){
        return participantsMapper.getParticipants(participant_id);
    }
}
