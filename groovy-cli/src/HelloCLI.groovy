@RestController
class HelloCLI {
    @RequestMapping("/")
    String home() {
        "Hello World!"
    }
}