

@RestController
@RequestMapping("/api/signup")
public class RegistrationController{

    @Autowired
    RegistrationService registraionService;

    @postMapping()
    public Mono<> registereUser(@RequestBody Registration reg){

        registraionService.registereUser(reg);

    }
}