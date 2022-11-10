package pe.com.escuelanueva.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pe.com.escuelanueva.entity.DistritoEntity;
import pe.com.escuelanueva.service.DistritoService;

//@RestController define que es un controlador Rest
//Aparece apartir de la Version 4 de Spring
@RestController
//@Controller --> es un controlador de Spring
//@ResponseBody --> se volvia un controlador Rest
//@RestController = @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoservice;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<DistritoEntity> findAll(){
        return distritoservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return distritoservice.findAllCustom();
    }
    
    //@PostMapping --> permite enviar datos
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d){
        return distritoservice.add(d);
    }
    
}
