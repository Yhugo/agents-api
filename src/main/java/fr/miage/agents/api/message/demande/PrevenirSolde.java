package fr.miage.agents.api.message.demande;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by nitix on 14/11/16.
 */
public class PrevenirSolde extends Message {

    public PrevenirSolde() {
        super(TypeMessage.PrevenirSolde);
    }
}
