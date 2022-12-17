

@RestController
@RequestMapping("/registration")
public class RegistrationController{

    @Autowired
    RegistrationService registraionService;

    @postMapping()
    public Mono<> registereUser(@RequestBody Registration reg){

        registraionService.registereUser(reg);

    }
}