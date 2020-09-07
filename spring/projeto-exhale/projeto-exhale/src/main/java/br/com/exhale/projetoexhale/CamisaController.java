package br.com.exhale.projetoexhale;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/camisas")

public class CamisaController {

    //------------

    private List<Camisa> camisas = new ArrayList<>();

    //------------

    @GetMapping
    public List listarCamisas() {
        return camisas;
    }
    /*public ResponseEntity listarCamisas() {
        if (camisas.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok(camisas);
        }
    }*/

    //-----------

    @GetMapping("/{id}")
    public ResponseEntity buscarCamisa(@PathVariable int id) {
        if (camisas.size() >= id) {
            return ResponseEntity.ok(camisas.get(id-1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/comum")
    public ResponseEntity criarCamisaC(@RequestBody CamisaComum novaCamisa) {
        camisas.add(novaCamisa);
       return ResponseEntity.status(201).build();
    }

    //-----------

   @PostMapping("/pollo")
    public ResponseEntity criarCamisaP(@RequestBody CamisaPollo novaCamisa) {
        camisas.add(novaCamisa);
        return ResponseEntity.status(201).build();

    }

    //-----------

    @DeleteMapping("/{id}")
    public ResponseEntity excluirCamisa(@PathVariable int id) {
        if (camisas.size() >= id) {
            camisas.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
