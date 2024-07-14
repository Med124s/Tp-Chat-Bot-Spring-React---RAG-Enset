package net.benyghil.chatbotrag.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import net.benyghil.chatbotrag.PersonRepository;
import net.benyghil.chatbotrag.entities.Person;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {
}
