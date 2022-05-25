/**
 * 
 */
package Calculadora.Calculadora.Controllers;

/**
 * @author moigo
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculadoraController {
	
	@GetMapping("/calculadora")
	public String index(Model modelo) 
	{
		modelo.addAttribute("calcu", new calcular());
		return "calculadora/index";
	}
	
	@PostMapping("/resultado")
	
	public String resultado(@ModelAttribute calcular calcu, Model modelo) 
	{
		calcu.Calcular();
		modelo.addAttribute("calcu", calcu);
		return "calculadora/index";
	}
	
}
