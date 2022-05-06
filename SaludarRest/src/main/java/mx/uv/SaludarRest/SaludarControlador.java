package mx.uv.SaludarRest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SaludarControlador {

    List <saludos> listaSaludos =new ArrayList<saludos>();
    int contador =0;
    @RequestMapping("/")
    public String home(){
        return("hola mundo home");
    }
    @RequestMapping(value ="/saludar", method = RequestMethod.GET)
    public String saludarGET(){
        return "hola/saludar GET ";
    }
    @RequestMapping(value ="/saludar", method = RequestMethod.POST)
    public String saludarPOST(){
        return "hola/saludar POST ";
    }

    @GetMapping("/saludar1")
    public Saludador saludarPath1(@PathVariable("XXX") String nombreX){
        return new Saludador(nombreX);
    }
    @RequestMapping(value ="/saludar2/{nombre}", method = RequestMethod.GET)
    public String saludarPath2(@PathVariable String nombre){
        return "hola nombre="+nombre;

    }
    @GetMapping("/saludar1")
    public Saludador saludarme1(@RequestParam(name="xx", defaultValue ="hola") String nombreX){
        return new Saludador(nombreX);
    }
    @GetMapping("/saludar2")
    public Saludador saludarme2(@RequestParam(name="xx", defaultValue ="hola") String nombreX){
        return new Saludador(nombreX);
    }
    @GetMapping("/saludarTarea")
    public String saludarTarea(@RequestParam(name="nombre",defaultValue = "andres")String nombre){
        saludos saludos = new saludos();
        saludos.setNombre(nombre);
        saludos.setId(contador);
        listaSaludos.add(saludos);
        contador++;
        return "hola" +nombre;
    }





}
