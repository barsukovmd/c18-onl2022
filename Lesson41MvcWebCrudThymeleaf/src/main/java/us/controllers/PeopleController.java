package us.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import us.dao.PersonDAO;
import us.models.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("people", personDAO.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", personDAO.show(id));
        return "people/show";
    }

    //    @GetMapping("/new")
//    public String newPerson(Model model) {
//        model.addAttribute("person", new Person());
//        return "people/new";
//    }
    @GetMapping("/new")
    public String addPerson(@ModelAttribute("person") Person person) {
        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        personDAO.save(person);
        return "redirect:/people";
    }
}

//    @PostMapping
//    public String create(@ModelAttribute("person") Person person) {
//      добавляем человека в базу данных
//        если не задать поля для то добавим Person со значениями null/0
//        person.setId(5);
//        person.setName("Eugene");
//        person.setSurname("Barsukov");
//        person.setEmail("tenniszh@mail.ru");
//        return "person succesfully created";
//    }
//    В модель в каждом методе текущего контроллера добавляет ключ-значение
//Используется для добавления тех пар ключ-значение, которые нужны во всех моделях этоГо контроллера
//Любая модель из этого контроллера по умолчанию будет иметь значение с
//ключом headerMessage

//    @PostMapping()
//    public String create(@RequestParam("name") String name, @RequestParam("surname") String surname,
//                         @RequestParam("email") String email, Model model) {
//        Person person = new Person();
//        person.setId(5);
//        person.setName("Eugene");
//        person.setSurname("Barsukov");
//        person.setEmail("tenniszh@mail.ru");
//        model.addAttribute("person", person);
//        return "person succesfully created";
//    }
