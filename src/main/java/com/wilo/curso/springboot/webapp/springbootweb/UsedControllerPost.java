package com.wilo.curso.springboot.webapp.springbootweb;
import com.wilo.spring.webweb.Controllerle;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsedControllerPost {

    @PostMapping("/postt")
   public Controllerle postt (@RequestBody Controllerle Controllerle){

        return Controllerle;
    }
    @PutMapping ("/ptt")
    public Controllerle ptt (@RequestBody Controllerle Putting){

        return Putting;
    }

}
