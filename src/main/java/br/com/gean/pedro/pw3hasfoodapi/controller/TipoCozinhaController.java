package br.com.gean.pedro.pw3hasfoodapi.controller;
import java.util.ArrayList;
		
@RestController
@RequestMapping("/tipos-cozinha")
public class TipoCozinhaController {

	@Autowired
	private TiposCozinhaRepository repository;
	
	private List<TipoCozinha> dados = new ArrayList<TipoCozinha>();
	
	@GetMapping
	public List<TipoCozinha> listarTodos(){
		dados = repository.findAll();
		return dados;
	}
	
	@GetMapping("/(id)")
	public TipoCozinha buscarPorId(@PathVariable Integer id) {
		TipoCozinha tipo = new TipoCozinha();
		tipo = repository.findById(id).get();
		return tipo;
	}
}
