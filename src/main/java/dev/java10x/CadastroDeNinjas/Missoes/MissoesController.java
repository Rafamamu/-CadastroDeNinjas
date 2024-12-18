package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {


    public MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }



    // GET: Mandar uma requisição para mostrar para o usuário
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Missões listadas com sucesso";

    }

    //POST: Mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missoesService.criarMissoes( missao);
    }

    //PUT: Mandar uma requisição para alterar nossas missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

    // DELETE: Manda uma requisição para deletar missões
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao Deletada com sucesso";
    }


}
