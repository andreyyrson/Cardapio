package Restaurante.cardapio.Controller;

import Restaurante.cardapio.Entidades.Food;
import Restaurante.cardapio.Entidades.FoodRepository;
import Restaurante.cardapio.Entidades.FoodRequestDTO;
import Restaurante.cardapio.Entidades.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Food")
public class FoodController {
    @Autowired

    private FoodRepository foodRepository;
    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @PostMapping("")
    public void SaveFood(@RequestBody FoodRequestDTO data) {
        Food FoodData = new Food(data);
        foodRepository.save(FoodData);
    }
    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @GetMapping()
    public List<FoodResponseDTO> GetAll(){
        List<FoodResponseDTO> FoodList= foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return FoodList;
    }
}
